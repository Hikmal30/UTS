package service;

import model.Pasien;
import model.Transaksi;

public class CheckupService implements Service {

    @Override
    public Transaksi process(Pasien pasien) {
        int biaya = 100000;

        if (pasien.isMember()) {
            biaya *= 0.9;
        }

        System.out.println("[LOG] Check-up diproses");
        return new Transaksi("Check-up", biaya);
    }
}