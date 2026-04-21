/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Pasien {
    private final String nama;
    private boolean member;
    
    
    public Pasien(String nama, boolean member1) {
        this.nama = nama;
        this.member = member;
    }
    
    public String getNama() {
        return nama;
    }
    
    public boolean isMember() {
        return member;
    }
}
