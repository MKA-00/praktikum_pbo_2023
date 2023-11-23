package praktikum2;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1,angka2,hasil;
		String operasi;
//		input user
		System.out.print("Masukan angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan angka 2 : ");
		angka2 = input.nextInt();
//		input operasi
		System.out.print("List operasi : "
				+ "\n + : Pertambahan"
				+ "\n - : Pengurangan"
				+ "\n * : Perkalian"
				+ "\n / : Pembagian"
				+ "\n Masukan simbol operasi : ");
		operasi = input.next();
		
		switch(operasi) {
			case "+":
				hasil = angka1 + angka2;
				System.out.println("Hasilnya adalah : "+hasil);
				break;
			case "-":
				hasil = angka1 - angka2;
				System.out.println("Hasilnya adalah : "+hasil);
				break;
			case "*":
				hasil = angka1 * angka2;
				System.out.println("Hasilnya adalah : "+hasil);
				break;
			case "/":
				hasil = angka1 / angka2;
				System.out.println("Hasilnya adalah : "+hasil);
				break;
			default :
				System.out.print("Simbol Tidak Sesuai !");
				break;
		}
		input.close();
		
			
		
	}
}
