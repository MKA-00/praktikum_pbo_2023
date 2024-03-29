package praktikum5;
// Inheritance (Pewarisan)
// dan visibility

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}
class Cat extends Hewan{
	String warna;
	int berat;
	
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	public void eat() {
		System.out.print(Cat.name + " Makan Whiskas");
	}	
// visibility
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}