package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.model.GetUserItem

class CustomAdapter :RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     val user = differ.currentList.get(position)
        holder.itemView.apply {
            firstName.text = user.firstName
            lastName.text = user.lastName

        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    private val differCallback = object:DiffUtil.ItemCallback<GetUserItem>(){
        override fun areItemsTheSame(oldItem: GetUserItem, newItem: GetUserItem): Boolean {
            return oldItem.accountId ==newItem.accountId
        }

        override fun areContentsTheSame(oldItem: GetUserItem, newItem: GetUserItem): Boolean {
            return oldItem==newItem
        }

    }
    val differ = AsyncListDiffer(this,differCallback)
}