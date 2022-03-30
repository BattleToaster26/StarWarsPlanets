package com.example.starwarsplanets.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.starwarsplanets.R
import com.example.starwarsplanets.model.PlanetData
import com.example.starwarsplanets.viewmodel.PlanetsAdapter
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mDatabase: DatabaseReference
    private lateinit var planetList: ArrayList<PlanetData>
    private lateinit var mAdapter: PlanetsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        planetList = ArrayList()
        mAdapter = PlanetsAdapter(this, planetList)
        recyclerPlanets.layoutManager = LinearLayoutManager(this)
        recyclerPlanets.setHasFixedSize(true)

        getPlanetsData()
    }

    private fun getPlanetsData() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Planets")
        mDatabase.addValueEventListener(object:ValueEventListener{

        })
    }
}