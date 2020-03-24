package edu.vt.cs.cs5254.dreamcatcher

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.vt.cs.cs5254.dreamcatcher.database.Dream

private const val TAG = "DreamAdapter"

class DreamAdapter(var dreams: List<Dream>, val callbacks: DreamListFragment.Callbacks?): RecyclerView.Adapter<DreamHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DreamHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view =
            inflater.inflate(R.layout.list_item_dream, parent, false)
        Log.d(TAG, "onCreateViewHolder")
        return DreamHolder(view, callbacks)
    }

    override fun getItemCount() = dreams.size

    override fun onBindViewHolder(holder: DreamHolder, position: Int) {
        val dream = dreams[position]
        holder.bind(dream)
    }
}
