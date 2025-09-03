package com.example.tarea1_elementosinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat

class SelectionControlsFragment : Fragment() {

    private lateinit var checkBoxOpcion1: CheckBox
    private lateinit var checkBoxOpcion2: CheckBox
    private lateinit var textViewCheckBoxEstado: TextView

    private lateinit var radioGroupOpciones: RadioGroup
    private lateinit var textViewRadioEstado: TextView

    private lateinit var switchActivar: SwitchCompat
    private lateinit var textViewSwitchEstado: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_selection_controls, container, false)

        // CheckBox
        checkBoxOpcion1 = view.findViewById(R.id.checkbox_opcion1)
        checkBoxOpcion2 = view.findViewById(R.id.checkbox_opcion2)
        textViewCheckBoxEstado = view.findViewById(R.id.textView_checkbox_estado)

        val checkBoxListener = View.OnClickListener {
            val seleccionados = mutableListOf<String>()
            if (checkBoxOpcion1.isChecked) seleccionados.add("Opción A")
            if (checkBoxOpcion2.isChecked) seleccionados.add("Opción B")

            textViewCheckBoxEstado.text = if (seleccionados.isNotEmpty()) {
                "Estado: ${seleccionados.joinToString(", ")}"
            } else {
                "Estado: Ninguna seleccionada"
            }
        }

        checkBoxOpcion1.setOnClickListener(checkBoxListener)
        checkBoxOpcion2.setOnClickListener(checkBoxListener)

        // RadioButton
        textViewRadioEstado = view.findViewById(R.id.textView_radio_estado)
        radioGroupOpciones = view.findViewById(R.id.radioGroup_opciones)
        radioGroupOpciones.setOnCheckedChangeListener { _, checkedId ->
            val radioButtonSeleccionado = view.findViewById<RadioButton>(checkedId)
            if (radioButtonSeleccionado != null) {
                textViewRadioEstado.text = "Estado: ${radioButtonSeleccionado.text}"
            } else {
                textViewRadioEstado.text = "Estado: Ninguna seleccionada"
            }
        }

        // Switch
        textViewSwitchEstado = view.findViewById(R.id.textView_switch_estado)
        switchActivar = view.findViewById(R.id.switch_activar)
        switchActivar.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textViewSwitchEstado.text = "Estado: Activado"
            } else {
                textViewSwitchEstado.text = "Estado: Desactivado"
            }
        }

        // Inicializar estados
        checkBoxListener.onClick(null) // Estado inicial CheckBox
        if (radioGroupOpciones.checkedRadioButtonId == -1) {
            textViewRadioEstado.text = "Estado: Ninguna seleccionada"
        }
        textViewSwitchEstado.text = if (switchActivar.isChecked) "Estado: Activado" else "Estado: Desactivado"

        return view
    }
}
