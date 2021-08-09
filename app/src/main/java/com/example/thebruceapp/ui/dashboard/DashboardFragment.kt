package com.example.thebruceapp.ui.dashboard

import com.example.thebruceapp.R
import com.example.thebruceapp.databinding.FragmentDashboardBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private var currentImage:Int = 6


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        val rollButton: ImageButton = binding.button2
        rollButton.setOnClickListener {
            rollDice(currentImage)
        }


        rollDice(currentImage)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun rollDice(current: Int) {
        val dice = Dice(6)
        val diceRoll = dice.roll(current)
        if (currentImage!=6)
            currentImage++
        else
            currentImage=1
        val resultImageView: ImageView = binding.imageView
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.card1
            2 -> R.drawable.card2
            3 -> R.drawable.card3
            4 -> R.drawable.card4
            5 -> R.drawable.card5
            else -> R.drawable.card6
        }
        resultImageView.setImageResource(drawableResource)
        resultImageView.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(curr: Int): Int {
        return when (curr) {
            1 -> 2
            2 -> 3
            3 -> 4
            4 -> 5
            5 -> 6
            else -> 1
        }
    }
}