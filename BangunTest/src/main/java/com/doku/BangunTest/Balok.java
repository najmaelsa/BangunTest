package com.doku.BangunTest;

public class Balok extends PersegiPanjang implements BangunRuang {

    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    int getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return getPanjang() * getLebar() * tinggi;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Tinggi : " + tinggi + "\n";
    }
}
