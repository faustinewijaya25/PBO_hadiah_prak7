import java.util.Scanner;
class hprak7 extends tipe {
	void tmpl2() {
	boolean loop = true;
	Scanner masukan = new Scanner(System.in);
	System.out.println("Blok: ");
	System.out.println("1. A : Rp.800.000");
	System.out.println("2. B : Rp.600.000");
	System.out.print("Blok yang dipilih = ");
	blokk = masukan.nextInt();
	switch(blokk) {
		case 1 :    System.out.print("Bayaran Anda = ");
					bayar = masukan.nextInt();
					kembalian = bayar - 800000;
					System.out.println();
					hargabayar = 800000;
					loop =  false; break;
		case 2 :    System.out.print("Bayaran Anda = ");
					bayar = masukan.nextInt();
					kembalian = bayar - 600000; 
					System.out.println();
					hargabayar = 600000;
					loop =  false; break;
		default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih blok 1-2"); break;
	}
	}
}