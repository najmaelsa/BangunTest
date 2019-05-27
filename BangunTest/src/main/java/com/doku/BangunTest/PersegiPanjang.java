package com.doku.BangunTest;

public class PersegiPanjang extends Bangun implements BangunDatar {

    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public double getLuas() {
        return (panjang * lebar);
    }

    public String toString() {
        return "Panjang : " + panjang + "\n"
                + "Lebar  : " + lebar + "\n";
    }
}
