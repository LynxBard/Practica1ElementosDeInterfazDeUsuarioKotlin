package com.example.tarea1_elementosinterfaz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val sampleData = listOf(
        "🐱 Gato ninja",
        "🍕 Pizza voladora",
        "🚀 Viaje a Marte",
        "🦖 Dinosaurio en patineta",
        "🎩 Conejo con sombrero mágico",
        "🎮 Videojuego infinito",
        "🐉 Dragón amigable",
        "🍩 Donas infinitas",
        "🤖 Robot bailarín",
        "🌵 Cactus rockero",
        "🛸 OVNI perdido",
        "🐧 Pingüino gamer",
        "⚡ Rayo supersónico",
        "🐸 Rana DJ",
        "🎢 Montaña rusa fantasma"
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lists, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewLists)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = SimpleListAdapter(sampleData) {
            Toast.makeText(context, "Has seleccionado: $it", Toast.LENGTH_SHORT).show()
        }
    }

    private class SimpleListAdapter(
        private val items: List<String>,
        private val onItemClick: (String) -> Unit
    ) : RecyclerView.Adapter<SimpleListAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textView: TextView = itemView.findViewById(android.R.id.text1)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.textView.text = item
            holder.itemView.setOnClickListener { onItemClick(item) }
        }

        override fun getItemCount(): Int = items.size
    }
}
