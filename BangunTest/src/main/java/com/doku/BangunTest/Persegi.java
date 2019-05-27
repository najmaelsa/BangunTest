package com.doku.BangunTest;

public class Persegi extends Bangun implements BangunDatar {

    private int sisi;

    public Persegi (int sisi){
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public double getLuas() {
         return (sisi * sisi);
    }

    public String toString() {
        return "Sisi : " + sisi + "\n";
    }
}
