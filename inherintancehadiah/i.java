import java.util.Scanner;
class i extends h {
	void tmpl() {
	boolean loop = true;
	Scanner masukan = new Scanner(System.in);
	System.out.print("Tipe yang dipilih = ");
	tipe = masukan.nextInt();
	while(loop) {
	switch(tipe) {
		case 1 : 	System.out.println("Blok: ");
					System.out.println("1. A : Rp.500.000");
					System.out.println("2. B : Rp.300.000");
					System.out.print("Blok yang dipilih = ");
					blok = masukan.nextInt();
					switch(blok) {
					case 1 :   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - 500000;
							   System.out.println();
							   hargabayar = 500000;
							   loop =  false; break;
					case 2 :   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - 300000; 
							   System.out.println();;
							   hargabayar = 300000;
							   loop =  false; break; 
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih blok 1-2");
					}
					loop = false; break;
					
		case 2 : 	System.out.println("Blok: ");
					System.out.println("1. A : Rp.800.000");
					System.out.println("2. B : Rp.600.000");
					System.out.print("Blok yang dipilih = ");
					blokk = masukan.nextInt();
					switch(blokk) {
					case 1 :   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - 800000;
							   System.out.println();
							   hargabayar = 800000;
							   loop =  false; break;
					case 2 :   System.out.print("Bayaran Anda = ");
							   bayar = masukan.nextInt();
							   kembalian = bayar - 600000; 
							   System.out.println();
							   hargabayar = 600000;
							   loop =  false; break;
					default : System.out.println("Tipe yang Anda masukkkan Salah!! Silahkan pilih blok 1-2"); break;
					}
					loop = false; break;
					
		default :   System.out.println("Merek yang anda masukan salah! Masukkan merek yang benar!");
	}
	break;
	}
}
}