public class Ogretmen {
	String isim;
	String soyisim;
	private String TCNo;
	String sicilNo;
	private double maas;

	String brans;
	Derslik[] siniflar;
	Okul okul;

	public Ogretmen(String isim, String soyisim, String TCNo, String sicilNo, double maas, String brans) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.TCNo = TCNo;
		this.sicilNo = sicilNo;
		this.maas = maas;
		this.brans = brans;

	}
}