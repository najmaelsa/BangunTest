package com.doku.BangunTest;

public class Limas extends Persegi implements BangunRuang {

    private int tinggi;

    public Limas(int sisi, int tinggi){
        super(sisi);
        this.tinggi = tinggi;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return 1.0 / 3 * getLuas() * tinggi;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Tinggi : " + tinggi + "\n";
    }
}
