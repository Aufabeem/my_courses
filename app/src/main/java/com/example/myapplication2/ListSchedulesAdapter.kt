package com.example.myapplication2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSchedulesAdapter(private val listSchedule: ArrayList<Schedules>) : RecyclerView.Adapter<ListSchedulesAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemScheduleName: TextView = itemView.findViewById(R.id.item_schedule_name)
        var itemScheduleAddress: TextView = itemView.findViewById(R.id.item_schedule_address)
        var itemScheduleTime: TextView = itemView.findViewById(R.id.item_schedule_time)
        var itemSchedulePicture: ImageView = itemView.findViewById(R.id.item_schedule_picture)
    }

    //override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
    //        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_hero, viewGroup, false)
    //        return ListViewHolder(view)
    //    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSchedulesAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_schedules, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSchedule.size
    }

    override fun onBindViewHolder(holder: ListSchedulesAdapter.ListViewHolder, position: Int) {
        val schedulesItem = listSchedule[position]

        Glide.with(holder.itemView.context)
                .load(schedulesItem.picture)
                .apply(RequestOptions().override(100,100))
                .into(holder.itemSchedulePicture)

        holder.itemScheduleName.text = schedulesItem.name
        holder.itemScheduleAddress.text = schedulesItem.address
        holder.itemScheduleTime.text = schedulesItem.schedule


        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listSchedule[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Schedules)
    }
}