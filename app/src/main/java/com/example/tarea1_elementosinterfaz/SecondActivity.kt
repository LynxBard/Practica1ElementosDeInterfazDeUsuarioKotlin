package com.example.tarea1_elementosinterfaz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Una Activity es un componente de la aplicación que proporciona una pantalla con la que los usuarios pueden interactuar
 * para hacer algo, como marcar un número de teléfono, tomar una foto, enviar un correo electrónico o ver un mapa.
 * Cada Activity recibe una ventana en la que dibujar su interfaz de usuario.
 * Por lo general, la ventana ocupa toda la pantalla, pero también puede ser más pequeña que la pantalla y flotar
 * encima de otras ventanas.
 *
 * Esta SecondActivity es un ejemplo de una pantalla secundaria en la aplicación, demostrando la navegación
 * entre Activities.
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}