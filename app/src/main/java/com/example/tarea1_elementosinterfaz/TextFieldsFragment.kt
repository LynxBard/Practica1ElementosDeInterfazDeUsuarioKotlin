package com.example.tarea1_elementosinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TextFieldsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_fields, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editTextInteractiveInput = view.findViewById<EditText>(R.id.editText_interactive_input)
        val buttonShowText = view.findViewById<Button>(R.id.button_show_text)
        val textViewInteractiveOutput = view.findViewById<TextView>(R.id.textView_interactive_output)

        buttonShowText.setOnClickListener {
            val inputText = editTextInteractiveInput.text.toString()
            if (inputText.isNotEmpty()) {
                textViewInteractiveOutput.text = "Texto ingresado: $inputText"
            } else {
                textViewInteractiveOutput.text = "Por favor, ingresa texto en el campo."
            }
        }
    }
}