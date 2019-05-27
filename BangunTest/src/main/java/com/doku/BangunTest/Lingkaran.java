package com.doku.BangunTest;

public class Lingkaran extends Bangun implements BangunDatar{

    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getLuas() {
        return (r * r * 3.14);
    }

    public String toString() {
        return "Jari-jari : " + r + "\n";
    }
}
