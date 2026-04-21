/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import model.Pasien;
import model.Transaksi;

/**
 *
 * @author MOLLL
 */
public interface Service {
    Transaksi process(Pasien pasien);
}
