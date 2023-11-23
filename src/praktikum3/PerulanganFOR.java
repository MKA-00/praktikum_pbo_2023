package praktikum3;

public class PerulanganFOR {
	public static void main(String[] args) {
		System.out.println("Looping For");
		for(int angka=4; angka<=10; angka++) {
			System.out.println("Angka ke-"+angka);
		}
		System.out.println("\n\n===================\n\n");
		System.out.println("Lopping While");
		int angka=1;
		while (angka<=10) {
			System.out.println("angka ke-"+angka);
			angka++;
		}
		System.out.println("\n\n===================\n\n");
		System.out.println("Looping Do While");
		int angka1=0;
		do {
		System.out.println("Angka ke-"+angka1);
		angka1++;
		}
		while(angka1<=3);
	}
}
