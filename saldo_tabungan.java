/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.text.DecimalFormat;
public class saldo_tabungan {
    



    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000;
        double bungaPerBulan = 15; // dalam persen
        int lamaBulan = 6;

        DecimalFormat formatter = new DecimalFormat("#,###");

        // Menampilkan saldo awal
        System.out.println("Saldo Awal: Rp " + formatter.format(saldoAwal));

        // Perhitungan saldo untuk setiap bulan
        for (int i = 1; i <= lamaBulan; i++) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
            System.out.println("Saldo bulan ke-" + i + ": Rp " + formatter.format(saldoAwal));
        }
    }
}
