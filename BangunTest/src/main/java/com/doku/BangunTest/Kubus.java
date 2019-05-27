package com.doku.BangunTest;

public class Kubus extends Persegi implements BangunRuang {
    private int sisi;

    public Kubus(int sisi) {
        super(sisi);
        this.sisi = sisi;
    }

    public double getVolume() {
        return getLuas() * sisi;
    }

    public String toString() {
        return super.toString() + "\n";
    }
}
