package com.example.starwarsplanets.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starwarsplanets.R
import com.example.starwarsplanets.viewmodel.getProgressDrawable
import com.example.starwarsplanets.viewmodel.loadImage
import kotlinx.android.synthetic.main.activity_new.*
import kotlinx.android.synthetic.main.planet_list.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val planetIntent = intent
        val planetNameNew = planetIntent.getStringExtra("planetName")
        val planetTypeNew = planetIntent.getStringExtra("planetType")
        val planetDescriptionNew = planetIntent.getStringExtra("planetDescription")
        val planetImageNew = planetIntent.getStringExtra("planetImage")

        planetNameDetail.text = planetNameNew
        planetTypeDetail.text = planetTypeNew
        planetDescription.text = planetDescriptionNew
        planetImageDetail.loadImage(planetImageNew, getProgressDrawable(this))
    }
}