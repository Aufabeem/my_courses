package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() , View.OnClickListener {
    private lateinit var rvSchedules: RecyclerView
    private var list: ArrayList<Schedules> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfileMovement: Button = findViewById(R.id.button_profile)
        btnProfileMovement.setOnClickListener(this)

        rvSchedules = findViewById(R.id.recycle_view)
        rvSchedules.setHasFixedSize(true)


        list.addAll(DetailSchedules.listData)
        showRecyclerList()
    }

    private fun showSelectedSchedule(schedule: Schedules) {
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.DETAIL_NAME, schedule.name)
        moveIntent.putExtra(DetailActivity.DETAIL_ADDRESS, schedule.address)
        moveIntent.putExtra(DetailActivity.DETAIL_NUMBER, schedule.number)
        moveIntent.putExtra(DetailActivity.DETAIL_SCHEDULE, schedule.schedule)
        moveIntent.putExtra(DetailActivity.DETAIL_SKILL, schedule.skill)
        moveIntent.putExtra(DetailActivity.DETAIL_SUBJECT, schedule.subject)
        moveIntent.putExtra(DetailActivity.DETAIL_IMAGE, schedule.picture)
        startActivity(moveIntent)
//        Toast.makeText(this, "Kamu memilih " + schedule.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        rvSchedules.layoutManager = LinearLayoutManager(this)
        val listScheduleAdapter = ListSchedulesAdapter(list)
        rvSchedules.adapter = listScheduleAdapter

        listScheduleAdapter.setOnItemClickCallback(object : ListSchedulesAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Schedules) {
                showSelectedSchedule(data)
            }
        })
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.button_profile -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}

