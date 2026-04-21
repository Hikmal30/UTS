/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Pasien;
import model.Transaksi;


public class KonsultasiService implements Service {

    @Override
    public Transaksi process(Pasien pasien) {
        int biaya = 50000;

        if (pasien.isMember()) {
            biaya *= 0.9; // diskon 10%
        }

        System.out.println("[LOG] Konsultasi diproses");
        return new Transaksi("Konsultasi Dokter", biaya);
    }
}