/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Transaksi {
    private String layanan;
    private int biaya;
    
    public Transaksi(String layanan, int biaya) {
        this.layanan = layanan;
        this.biaya = biaya;
    }
    
    public int getBiaya() {
        return biaya;   
    }
    
    public void tampilkan() {
        System.out.println("Layanan: " + layanan + "| Biaya: Rp " + biaya);
    }
}
