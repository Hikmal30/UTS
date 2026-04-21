package service;

import model.Pasien;
import model.Transaksi;

public class DokterService implements Service {

    @Override
    public Transaksi process(Pasien pasien) {
        int biaya = 150000;

        if (pasien.isMember()) {
            biaya *= 0.9;
        }

        System.out.println("[LOG] Konsultasi dokter spesialis diproses");
        return new Transaksi("Dokter Spesialis", biaya);
    }
}