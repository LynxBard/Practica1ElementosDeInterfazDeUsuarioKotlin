package com.example.tarea1_elementosinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import kotlin.random.Random

class InfoElementsFragment : Fragment() {

    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_elements, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progressBar = view.findViewById(R.id.progressBar_example)
        val buttonUpdateProgress: Button = view.findViewById(R.id.button_update_progress)

        buttonUpdateProgress.setOnClickListener {
            // Generate a random progress value between 0 and 100
            val randomProgress = Random.nextInt(0, 101)
            progressBar.progress = randomProgress
        }
    }
}