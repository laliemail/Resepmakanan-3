package com.tama.resepmakan;

/**
 * Created by RN on 10/12/2017.
 */

public class polaitem {

    private int image;
    private String juduls;
    private String deskripsis;
    public polaitem(int img, String judul, String deskripsi){
        this.image = img;
        this.juduls = judul;
        this.deskripsis = deskripsi;
    }

    public int getImg(){
        return this.image;
    }
    public String getJudul(){
        return  this.juduls;
    }
    public String getDeskripsi(){
        return this.deskripsis;
    }
    public void setImg(int img){
        this.image = img;
    }
    public void setJudul(String judul){
        this.juduls = judul;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsis = deskripsi;
    }
}
