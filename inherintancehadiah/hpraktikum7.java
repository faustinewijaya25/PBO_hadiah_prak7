public class hpraktikum7{
public static void main (String[] args) {
	h supobj = new h();
	i subobj = new i();

	supobj.tampil();
	subobj.tmpl();
	System.out.println("Nama = " +supobj.nama); 
	System.out.println("Alamat = " +supobj.alamat);
	System.out.println("Harga Bayar = " +subobj.hargabayar);
	System.out.println("Bayar = " +subobj.bayar); 
	System.out.println("Kembalian = " +subobj.kembalian);
	
}
}
