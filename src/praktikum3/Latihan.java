package praktikum3;

import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		inisialisasi
			Scanner input = new Scanner(System.in); {
			int angka1,angka2,hasil,operasi, perulangan;
			
			System.out.print("Masukan Perulangan : ");
			perulangan = input.nextInt();
//	perulangan for
		for(int i= 1; i<=perulangan;i++) {
			System.out.println("\nPerulangan ke-"+i);
			
			
			System.out.print("\nList angka operasi : "
					+ "\n1 : Pertambahan"
					+ "\n2 : Pengurangan"
					+ "\n3 : Perkalian"
					+ "\n4 : Pembagian"
					+ "\nMasukan angka operasi : ");
			operasi = input.nextInt();
			
			System.out.print("\nMasukan Angka 1 : ");
			angka1 = input.nextInt();
			System.out.print("Masukan Angka 2 : ");
			angka2 = input.nextInt();
			
			if(operasi == 1) {
				hasil = angka1 + angka2;
				System.out.print("Hasilnya adalah : "+hasil);
			} else if (operasi == 2) {
				hasil = angka1 - angka2;
				System.out.print("Hasilnya adalah : "+hasil);
			} else if (operasi == 3) {
				hasil = angka1 * angka2;
				System.out.print("Hasilnya adalah : "+hasil);
			} else if (operasi == 4) {
				hasil = angka1 / angka2;
				System.out.print("Hasilnya adalah : "+hasil);
			}
			}
			input.close();
		
		}
	}
}
