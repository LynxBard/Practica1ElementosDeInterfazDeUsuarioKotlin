package com.example.tarea1_elementosinterfaz

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)

        val buttonNormal = view.findViewById<Button>(R.id.button_normal)
        val imageButtonExample = view.findViewById<ImageButton>(R.id.image_button_example)
        val fabExample = view.findViewById<FloatingActionButton>(R.id.fab_example)
        val buttonNavigate = view.findViewById<Button>(R.id.button_navigate)

        buttonNormal.setOnClickListener {
            Toast.makeText(context, "Botón normal presionado", Toast.LENGTH_SHORT).show()
        }

        imageButtonExample.setOnClickListener {
            Toast.makeText(context, "ImageButton presionado", Toast.LENGTH_SHORT).show()
        }

        fabExample.setOnClickListener {
            Toast.makeText(context, "FloatingActionButton presionado", Toast.LENGTH_SHORT).show()
        }

        buttonNavigate.setOnClickListener {
            val intent = Intent(activity, SecondActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}