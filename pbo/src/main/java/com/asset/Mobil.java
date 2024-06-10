/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-25
 */
public class Mobil implements KendaraanBermotor{
    private String warna;
    private int kecepatan = 200;
    private double harga = 250000;
    private String merk;
    
    public Mobil(){
        this.harga = 300000.00;
        this.merk = "Toyota Innova";
        this.kecepatan = 250;
        this.warna = "Merah";
        System.out.println("konstruktor 1 tanpa parameter");
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
        System.out.println("konstruktor 2 tanpa parameter");
    }

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void getInfo(){
        System.out.println("Merk :" + this.merk);
        System.out.println("Harga :" + getHarga());
        System.out.println("Kecepatan Maksimal (km/jam) ="+ this.kecepatan);
        System.out.println("Warna :"+ this.warna);
    }

    @Override
    public void gasPol() {
        System.out.println("Gas maksimal");
    }

    @Override
    public void ngerem() {
        System.out.println("Kendaraan berhenti");
    }

}
