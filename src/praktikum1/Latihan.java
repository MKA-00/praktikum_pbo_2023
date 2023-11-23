package praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		System.out.println("hello word");
//		inisialisasi variabel
		int angka1, angka2, hasil;
//		inisialisasi input user
		Scanner input = new Scanner(System.in);
//		input user
		System.out.print("Masukan \nAngka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan \nAngka 2 : ");
		angka2 = input.nextInt();
//		hasil
		hasil = angka1 + angka2;
		System.out.println("Hasilnya adalah : "+hasil);
		
		String namaDepan, namaTengah  ,namaBelakang, fullName;
		
		System.out.print("Masukan Nama Depan : ");
		namaDepan = input.next();
		System.out.print("Masukan Nama Tengah : ");
		namaTengah = input.next();
		System.out.print("Masukan Nama Belakang : ");
		namaBelakang = input.next();
		input.close();
		
		fullName = namaDepan + " " + namaTengah + " " + namaBelakang;
		System.out.println(fullName);
	}
}
