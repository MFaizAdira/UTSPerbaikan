package com.faiz.uts_mi2a.Adapter

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faiz.uts_mi2a.Model.modelMakanan
import com.faiz.uts_mi2a.R
import com.faiz.uts_mi2a.makanan


class makananAdapter(
    val itemList:ArrayList<modelMakanan>,
    val getActivity: makanan

):
    RecyclerView.Adapter<makananAdapter.MyViewHolder>(), Parcelable {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari layoutitem
        var itemImage: ImageView
        var itemNama: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemNama = itemView.findViewById<TextView>(R.id.nama)!!

        }

    }

    constructor(parcel: Parcel) : this(
        TODO("itemList"),
        TODO("getActivity")
    ) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //manggil layout

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_makanan, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<makananAdapter> {
        override fun createFromParcel(parcel: Parcel): makananAdapter {
            return makananAdapter(parcel)
        }

        override fun newArray(size: Int): Array<makananAdapter?> {
            return arrayOfNulls(size)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
        //kita intent
        holder.itemView.setOnClickListener() {
            //inten
            //context atau this --> getActivity
            val intent = Intent(getActivity, makanan::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("nama", itemList[position].nama)
            //passed ke detail
            getActivity.startActivity(intent)

        }

    }
}