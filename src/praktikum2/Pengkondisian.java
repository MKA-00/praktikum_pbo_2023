package praktikum2;
import java.util.Scanner;

public class Pengkondisian {
	public static void main(String args []) {
//		inisialisasi
			Scanner input = new Scanner(System.in); {
			int angka1,angka2,hasil,operasi;
//		input user
			System.out.print("Masukan Angka 1 : ");
			angka1 = input.nextInt();
			System.out.print("Masukan Angka 2 : ");
			angka2 = input.nextInt();
//		input operasi
			System.out.print("List angka operasi : "
					+ "\n 1 : Pertambahan"
					+ "\n 2 : Pengurangan"
					+ "\n 3 : Perkalian"
					+ "\n 4 : Pembagian"
					+ "\n Masukan angka operasi : ");
			operasi = input.nextInt();
//		pengkondisian
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
			input.close();
		}
	}
}
