package com.doku.BangunTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BangunTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BangunTestApplication.class, args);

		Bangun p1 = new Bangun();

		PersegiPanjang p2 = new PersegiPanjang(3, 5);
		System.out.println("---Persegi Panjang---" + "\n" + p2);
		System.out.println("Luas: " + p2.getLuas());
		System.out.println("\n");

		Persegi p3 = new Persegi(5);
		System.out.println("---Persegi---" + "\n" + p3);
		System.out.println("Luas: " + p3.getLuas());
		System.out.println("\n");

		Lingkaran p4 = new Lingkaran(5);
		System.out.println("---Lingkaran---" + "\n" + p4);
		System.out.println("Luas: " + p4.getLuas());
		System.out.println("\n");

		Balok t1 = new Balok(3, 5, 4);
		System.out.println("---Balok---" + "\n" + t1);
		System.out.println("Volume: " + t1.getVolume());
		System.out.println("\n");

		Kubus t2 = new Kubus(5);
		System.out.println("---Kubus---" + "\n" + t2);
		System.out.println("Volume: " + t2.getVolume());
		System.out.println("\n");

		Tabung t3 = new Tabung(3, 5);
		System.out.println("---Tabung---" + "\n" + t3);
		System.out.println("Volume: " + t3.getVolume());
		System.out.println("\n");

		Kerucut t4 = new Kerucut(3, 6);
		System.out.println("---Kerucut---" + "\n" + t4);
		System.out.println("Volume: " + t4.getVolume());
		System.out.println("\n");

		Limas t5 = new Limas(3, 8);
		System.out.println("---Limas---" + "\n" + t5);
		System.out.println("Volume: " + t5.getVolume());
		System.out.println("\n");
	}

}
