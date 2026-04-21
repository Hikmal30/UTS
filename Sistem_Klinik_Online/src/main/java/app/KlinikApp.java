package app;

import model.*;
import service.Service;
import factory.ServiceFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class KlinikApp {

    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private ArrayList<Transaksi> riwayat = new ArrayList<>();
    private int totalBiaya = 0;

    public void run() {
        Scanner input = new Scanner(System.in);

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n============================");
            System.out.println("   SISTEM KLINIK ONLINE");
            System.out.println("============================");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Pilih Layanan");
            System.out.println("3. Lihat Riwayat");
            System.out.println("4. Total Pembayaran");
            System.out.println("0. Keluar");
            System.out.println("============================");
            System.out.print("Pilih: ");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    tambahPasien(input);
                    break;
                case 2:
                    pilihLayanan(input);
                    break;
                case 3:
                    tampilkanRiwayat();
                    break;
                case 4:
                    System.out.println("Total: Rp " + totalBiaya);
                    break;
                case 0:
                    jalan = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void tambahPasien(Scanner input) {
        System.out.print("Nama Pasien: ");
        String nama = input.nextLine();

        System.out.print("Member? (y/n): ");
        boolean member = input.nextLine().equalsIgnoreCase("y");

        daftarPasien.add(new Pasien(nama, member));
        System.out.println("[LOG] Pasien ditambahkan");
    }

    private void pilihLayanan(Scanner input) {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien!");
            return;
        }

        for (int i = 0; i < daftarPasien.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPasien.get(i).getNama());
        }

        System.out.print("Pilih pasien: ");
        int index = input.nextInt() - 1;

        System.out.println("\nLayanan:");
        System.out.println("1. Konsultasi");
        System.out.println("2. Beli Obat");
        System.out.println("3. Check-up");
        System.out.println("4. Dokter Spesialis");
        System.out.print("Pilih: ");

        int layanan = input.nextInt();

        Service service = ServiceFactory.create(layanan);

        if (service != null) {
            Transaksi trx = service.process(daftarPasien.get(index));
            riwayat.add(trx);
            totalBiaya += trx.getBiaya();

            System.out.println("Biaya: Rp " + trx.getBiaya());
        } else {
            System.out.println("Layanan tidak valid!");
        }
    }

    private void tampilkanRiwayat() {
        System.out.println("\n=== RIWAYAT ===");
        for (Transaksi t : riwayat) {
            t.tampilkan();
        }
    }
}