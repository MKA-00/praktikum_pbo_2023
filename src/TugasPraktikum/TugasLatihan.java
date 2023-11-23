package TugasPraktikum;

/*Nama  :  Muhammad Kemal Abidin (221106042911)
 *Kelas :  Reguler-D				  
 *Tugas :  Tugas Praktikum PBO
 */

public class TugasLatihan {
    public int angka1;
    public int angka2;
    public int hasil;
    public int operasi;
    public int perulangan;

    public void tambah() {
        hasil = angka1 + angka2;
    }

    public void kurang() {
        hasil = angka1 - angka2;
    }

    public void kali() {
        hasil = angka1 * angka2;
    }

    public void bagi() {
        if (angka2 == 0) {
            System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
            hasil = 0; // Atau Anda bisa menggunakan nilai lain sesuai kebutuhan.
        } else {
            hasil = angka1 / angka2;
        }
    }
}
