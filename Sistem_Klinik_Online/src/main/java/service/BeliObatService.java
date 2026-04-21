package service;

import model.Pasien;
import model.Transaksi;

public class BeliObatService implements Service {

    @Override
    public Transaksi process(Pasien pasien) {
        int biaya = 30000;

        if (pasien.isMember()) {
            biaya *= 0.9;
        }

        System.out.println("[LOG] Pembelian obat diproses");
        return new Transaksi("Beli Obat", biaya);
    }
}