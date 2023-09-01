package com.example.myapplication2

object DetailSchedules {
    private val detailName = arrayOf(
        "Sandi", "Andi", "Dimas", "Kamid", "Saepul",
        "Eka Darma", "Puji", "Setiawan", "Sidik", "Komen"
    )

    private val detailAddress = arrayOf(
        "Meteseh, Tembalang", "Tembalang, Tembalang", "Kramas, Tembalang", "Bulusan, Tembalang", "Rowosari, Tembalang",
        "Sendangmulyo, Tembalang", "Kedungmundu, Tembalang", "Sambiroto, Tembalang", "Mangunharjo, Tembalang", "Tandang, Tembalang"
    )

    private val detailSchedule = arrayOf(
        "Sun & Mon", "Sun & Tue", "Mon & Tue", "Mon & Wed", "Wed & Thu",
        "Wed & Fri", "Thu & Fri", "Thu & Sat", "Fri & Sat", "Sat & Mon"
    )

    private val detailSubject = arrayOf(
            "Math & Social", "Math & Laws", "Social & Laws", "Social & Physics", "Laws & Physics",
            "Law & Chemistry", "Physics & Chemistry", "Physics & Programing", "Chemistry & Programing", "Math & Laws"
    )

    private val detailNumber = arrayOf(
            "+62 831 1244 2334", "+62 831 1244 2122", "+62 831 1244 4212", "+62 831 1244 4442", "+62 831 1244 5455",
            "+62 831 7788 6554", "+62 831 5645 7788", "+62 831 3345 0075", "+62 831 0000 5454", "+62 831 3434 5544"
    )

    private val detailSkill = arrayOf(
            "Soccer", "Basket Ball", "Pianist", "Singing", "Dance",
            "Public Speaking", "Run", "Javelin Throw", "Tennis", "Swing"
    )

    private  val choisePicture = intArrayOf(
        R.drawable.satu_unsplash,
        R.drawable.dua_unsplash,
        R.drawable.tiga_unsplash,
        R.drawable.empat_unsplash,
        R.drawable.lima_unsplash,
        R.drawable.enam_unsplash,
        R.drawable.tujuh_unsplash,
        R.drawable.delapan_unsplash,
        R.drawable.sembilan_unsplash,
        R.drawable.sepuluh_unsplash
    )


    // menggunakan fungsi get ( constructur ) untuk mengambil data dan meparsing ke class Schedules
    val listData: ArrayList<Schedules>
        get() {
            val list = arrayListOf<Schedules>()
            for (position in detailName.indices) {
                val schedules = Schedules()
                schedules.picture = choisePicture[position]
                schedules.name = detailName[position]
                schedules.address = detailAddress[position]
                schedules.schedule = detailSchedule[position]
                schedules.subject = detailSubject[position]
                schedules.number = detailNumber[position]
                schedules.skill = detailSkill[position]
                list.add(schedules)
            }
            return list
        }
}