package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object{
        val DETAIL_IMAGE = "extra_image"
        val DETAIL_NAME = "extra_name"
        val DETAIL_SCHEDULE = "extra_schedule"
        val DETAIL_SUBJECT = "extra_subject"
        val DETAIL_ADDRESS = "extra_address"
        val DETAIL_NUMBER = "extra_number"
        val DETAIL_SKILL = "extra_skill"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailImage = findViewById<ImageView>(R.id.detail_image)
        val detailName = findViewById<TextView>(R.id.detail_name)
        val detailSchedule = findViewById<TextView>(R.id.detail_schedule)
        val detailSubject = findViewById<TextView>(R.id.detail_subject)
        val detailAddress = findViewById<TextView>(R.id.detail_address)
        val detailNumber = findViewById<TextView>(R.id.detail_number)
        val detailSkill = findViewById<TextView>(R.id.skill_detail)

        val name = intent.getStringExtra(DETAIL_NAME)
        val schedule = intent.getStringExtra(DETAIL_SCHEDULE)
        val subject: String? = intent.getStringExtra(DETAIL_SUBJECT)
        val skill = intent.getStringExtra(DETAIL_SKILL)
        val number = intent.getStringExtra(DETAIL_NUMBER)
        val address = intent.getStringExtra(DETAIL_ADDRESS)
        val image: Int? = intent.getIntExtra(DETAIL_IMAGE,0)

        detailName.text = name
        val tv_schedule = "Every $schedule \n 8 a.m."
        detailSchedule.text = tv_schedule
        detailSubject.text = subject
        detailAddress.text = address
        detailNumber.text = number
        detailSkill.text = skill
        if (image != null) {
//            Glide.with(this)
//                    .load(R.drawable.dua_unsplash)
//                    .apply(RequestOptions().override(55,55))
//                    .into(detailImage)
            if (name == "Sandi"){
                Glide.with(this)
                        .load(R.drawable.satu_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Andi"){
                Glide.with(this)
                        .load(R.drawable.dua_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Dimas"){
                Glide.with(this)
                        .load(R.drawable.tiga_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Kamid"){
                Glide.with(this)
                        .load(R.drawable.empat_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Saepul"){
                Glide.with(this)
                        .load(R.drawable.lima_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Eka Darma"){
                Glide.with(this)
                        .load(R.drawable.enam_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Puji"){
                Glide.with(this)
                        .load(R.drawable.tujuh_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Setiawan"){
                Glide.with(this)
                        .load(R.drawable.delapan_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Sidik"){
                Glide.with(this)
                        .load(R.drawable.sembilan_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else if (name == "Komen"){
                Glide.with(this)
                        .load(R.drawable.sepuluh_unsplash)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }else{
                Glide.with(this)
                        .load(R.drawable.foro_profil)
                        .apply(RequestOptions().override(200,200))
                        .into(detailImage)
            }
        }

    }
}

