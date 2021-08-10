package com.example.thebruceapp.ui.notifications

import com.example.thebruceapp.databinding.FragmentNotificationsBinding

import GalleryAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NotificationsFragment : Fragment() {


    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        val myDataset = Datasource().loadGallery()
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = GalleryAdapter(this, myDataset)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}