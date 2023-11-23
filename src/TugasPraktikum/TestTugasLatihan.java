package TugasPraktikum;

import java.util.Scanner;

/*Nama  :  Muhammad Kemal Abidin (221106042911)
 *Kelas :  Reguler-D				  
 *Tugas :  Tugas Praktikum PBO
 */

public class TestTugasLatihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TugasLatihan kalkulator = new TugasLatihan();
        
        System.out.print("Nama  : Muhammad Kemal Abidin");
        System.out.print("\nNPM   : 221106042911");
        System.out.print("\nKelas : Reguler-D");
        System.out.print("\n======================");

        System.out.print("\nMasukkan Jumlah Perulangan : ");
        int jumlahPerulangan = scanner.nextInt();

        for (int perulangan = 1; perulangan <= jumlahPerulangan; perulangan++) {
            System.out.println("\nPerulangan ke-" + perulangan);

            System.out.println("\nList Angka Operasi : ");
            System.out.println("1 : Pertambahan");
            System.out.println("2 : Pengurangan");
            System.out.println("3 : Perkalian");
            System.out.println("4 : Pembagian");

            System.out.print("Masukkan Angka Operasi : ");
            kalkulator.operasi = scanner.nextInt();

            System.out.print("Masukkan Angka 1 : ");
            kalkulator.angka1 = scanner.nextInt();

            System.out.print("Masukkan Angka 2 : ");
            kalkulator.angka2 = scanner.nextInt();

            if (kalkulator.operasi == 1) {
                kalkulator.tambah();
            } else if (kalkulator.operasi == 2) {
                kalkulator.kurang();
            } else if (kalkulator.operasi == 3) {
                kalkulator.kali();
            } else if (kalkulator.operasi == 4) {
                kalkulator.bagi();
            } else {
                System.out.println("Operasi tidak valid.");
                continue; // Skip ke iterasi selanjutnya
            }

            System.out.println("Hasilnya adalah : " + kalkulator.hasil);
        }

        scanner.close();
    }
}
