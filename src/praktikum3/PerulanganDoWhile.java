package praktikum3;

public class PerulanganDoWhile {
	/*inisialisasi
	*do {pengubah
	}while(kondisi)
	*/
	public static void main(String[]args) {
		int angka=5;
		do {
			System.out.println("Angka ke-"+angka);
			angka++;
		}while(angka<=10);
	}
}
