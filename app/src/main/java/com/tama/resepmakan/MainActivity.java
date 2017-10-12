package com.tama.resepmakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView listResepMakanan;
    LinearLayoutManager linier;

    String judul[],deskripsi[],bahan[],pembuatan[];
    int ImageSource[] = {
            R.drawable.ayam,
            R.drawable.sop,
    };

    item adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listResepMakanan = (RecyclerView) findViewById(R.id.list_resep_makanan);
        linier = new LinearLayoutManager(this);
        listResepMakanan.setLayoutManager(linier);

        judul = getResources().getStringArray(R.array.judul_item);
        deskripsi = getResources().getStringArray(R.array.deskripsi_item);
        bahan = getResources().getStringArray(R.array.bahan_bahan);
        pembuatan = getResources().getStringArray(R.array.cara_membuat);

        adapter = new item(this,judul,deskripsi,bahan,pembuatan,ImageSource);
        listResepMakanan.setAdapter(adapter);
        listResepMakanan.setLayoutManager(new LinearLayoutManager(this));
    }
}
