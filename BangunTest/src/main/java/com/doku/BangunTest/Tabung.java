package com.doku.BangunTest;

public class Tabung extends Lingkaran implements BangunRuang {

    private double tinggi;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return getLuas() * tinggi;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Tinggi : " + tinggi + "\n";
    }
}
