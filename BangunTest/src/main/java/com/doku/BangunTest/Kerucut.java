package com.doku.BangunTest;

public class Kerucut extends Lingkaran implements BangunRuang {

    private double tinggi;

    public Kerucut(double r, double tinggi) {
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
        return 1.0 / 3 * getLuas() * tinggi;
    }

    public String toString() {
        return super.toString() + "\n"
                + "Tinggi : " + tinggi + "\n";
    }
}
