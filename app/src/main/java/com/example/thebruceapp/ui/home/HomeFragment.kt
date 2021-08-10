package com.example.thebruceapp.ui.home

import com.example.thebruceapp.R
import com.example.thebruceapp.databinding.FragmentHomeBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    // ArrayList for album names
    var albumNames: ArrayList<*> = ArrayList(
        listOf(
            "Greetings from Asbury Park, N.J.",
            "The Wild, the Innocent & the E Street Shuffle",
            "Born to Run",
            "Darkness on the Edge of Town",
            "The River",
            "Nebraska",
            "Born in the U.S.A.",
            "Tunnel of Love",
            "Human Touch",
            "Lucky Town",
            "The Ghost of Tom Joad",
            "The Rising",
            "Devils & Dust",
            "We Shall Overcome:\n" +
                    "The Seeger Sessions",
            "Magic",
            "Working on a Dream",
            "Wrecking Ball",
            "High Hopes",
            "Western Stars",
            "Letter to You"
        )
    )
    var albumImages: ArrayList<*> = ArrayList(
        listOf<Any>(
            R.drawable.greetings_1,
            R.drawable.the_wild_the_innocent,
            R.drawable.born_to_run,
            R.drawable.darknessontheedgeoftown,
            R.drawable.theriver,
            R.drawable.nebraska,
            R.drawable.bornintheusa,
            R.drawable.tunneloflove,
            R.drawable.humantouch,
            R.drawable.lucky_town,
            R.drawable.theghostoftomjoad,
            R.drawable.therising,
            R.drawable.devilsanddust,
            R.drawable.seegersessions,
            R.drawable.magic,
            R.drawable.workingonadream,
            R.drawable.wrecking_ball,
            R.drawable.high_hopes,
            R.drawable.westernstars,
            R.drawable.lettertoyou
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get the reference of RecyclerView
        val recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        val gridLayoutManager = GridLayoutManager(applicationContext, 2)
        recyclerView.layoutManager = gridLayoutManager // set LayoutManager to RecyclerView
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        val customAdapter = CustomAdapter(this@MainActivity, personNames, personImages)
        recyclerView.adapter = customAdapter // set the Adapter to RecyclerView*/
    }
}