package com.tama.resepmakan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RN on 10/12/2017.
 */

public class item extends RecyclerView.Adapter<item.ItemHolder>{
    Context context;
    String judul[],deskripsi[],bahan[],pembuatan[];
    int img[];

    public item(Context context, String juduls[],String des[], String bahans[], String pembuatans[], int imgs[]) {
        this.context = context;
        this.judul = juduls;
        this.deskripsi = des;
        this.bahan = bahans;
        this.pembuatan = pembuatans;
        this.img = imgs;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rows,null);
        return new ItemHolder(v);
    }
    @Override
    public void onBindViewHolder(final ItemHolder holder, final int position) {
        holder.textJudul.setText(judul[position]);
        holder.textDeskripsi.setText(deskripsi[position]);
        holder.img_item.setImageResource(img[position]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Detail.class);
                i.putExtra("id_img", img[position]);
                i.putExtra("id_judul", judul[position]);
                i.putExtra("id_deskripsi", deskripsi[position]);
                i.putExtra("id_bahan", bahan[position]);
                i.putExtra("id_pembuatan", pembuatan[position]);
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return judul.length;
    }

    class ItemHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView img_item;
        TextView textJudul, textDeskripsi;
        
        public ItemHolder(View v) {
            super(v);
            img_item = (ImageView) v.findViewById(R.id.img_makanan);
            textJudul = (TextView) v.findViewById(R.id.text_judul);
            textDeskripsi = (TextView) v.findViewById(R.id.text_deskripsi);
            cardView = (CardView) v.findViewById(R.id.cardItem);
        }
    }


}


