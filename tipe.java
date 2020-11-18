import java.util.Scanner;
class tipe {
	String nama;
	String alamat;
	int tipe;
	int blok;
	int blokk;
	int bayar;
	int kembalian, hargabayar;
	Scanner masukan = new Scanner(System.in);
	void tampil() {
	System.out.print("Masukkan Nama = ");
	nama = masukan.nextLine();
	System.out.print("Masukkan Alamat = ");
	alamat = masukan.nextLine();
	System.out.println("Tipe: ");
	System.out.println("1. Tipe 36");
	System.out.println("2. Tipe 37");
}
}