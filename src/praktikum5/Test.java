package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String namaKucing, warnaKucing;
		int beratKucing;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Nama Kucing : ");
		namaKucing = input.nextLine();
		
		System.out.print("Masukan Warna Kucing : ");
		warnaKucing = input.nextLine();
		
		System.out.print("Masukan Berat Kucing : ");
		beratKucing = input.nextInt();
		Cat kucingSaya = new Cat();
		
		input.close();
		
		kucingSaya.identitas(namaKucing,warnaKucing,beratKucing);
		System.out.println("Kucing "+kucingSaya.name
				+" warnanya "+kucingSaya.ambilWarna()
				+" beratnya "+kucingSaya.ambilBerat()+"kg");
		kucingSaya.eat();
	}
}
