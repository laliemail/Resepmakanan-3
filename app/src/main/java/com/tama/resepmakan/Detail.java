package com.tama.resepmakan;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by RN on 10/12/2017.
 */

public class Detail extends AppCompatActivity {

    //Deklarasi Variabel
    ImageView imgDetail;
    TextView txtJudul, txtDeskripsi, txtBahan, txtPembuatan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        imgDetail = (ImageView) findViewById(R.id.img_detail_makan);
        txtJudul = (TextView) findViewById(R.id.text_detail_judul);
        txtDeskripsi = (TextView) findViewById(R.id.text_detail_deskripsi);
        txtBahan = (TextView) findViewById(R.id.text_detail_bahan);
        txtPembuatan = (TextView) findViewById(R.id.text_detail_pembuatan);
        getData();
    }

    private void getData(){
        txtJudul.setText(getIntent().getStringExtra("id_judul"));
        txtDeskripsi.setText(getIntent().getStringExtra("id_deskripsi"));
        imgDetail.setImageResource(getIntent().getIntExtra("id_img",0));
        txtBahan.setText(getIntent().getStringExtra("id_bahan"));
        txtPembuatan.setText(getIntent().getStringExtra("id_pembuatan"));
    }

}
