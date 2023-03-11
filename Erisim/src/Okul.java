public class Okul {

	String isim;
	String adres;
	Derslik[] derslikler;
	String seviye;
	private double butce;

	Mudur mudur;
	Mudur mudurYardimcisi;

	Ogretmen rehberOgretmeni;
	Ogretmen[] sinifOgretmeni;
	Ogretmen muzikOgretmeni;
	Ogretmen resimOgretmeni;
	Ogretmen bedenEgitimiOgretmeni;
	Ogretmen yabanciDilOgretmeni;

	public Okul(String isim, String adres, Derslik[] derslikler, String seviye, double butce) {
		this.isim = isim;
		this.adres = adres;
		this.derslikler = derslikler;
		this.seviye = seviye;
		this.butce = butce;
	}

	public static void main(String[] args) {
		String isim = "Bahcelievler Ilkokulu";
		String adres = "Bahcelievler 5.cadde No:12 Ankara";
		int sinifSayisi = 20;
		String seviye = "Ilkokul";
		double butce = 5000000.0;

		Mudur bahcelievlerMuduru = new Mudur("Necip", "Uysal", "15155151", "1111", 12000);
		Mudur bahcelievlerMudurYardimcisi = new Mudur("Emre", "Alkis", "5151515", "1112", 11000);

		Okul bahcelievlerIlkokulu = new Okul(isim, adres, new Derslik[sinifSayisi], seviye, butce);
		bahcelievlerIlkokulu.mudur = bahcelievlerMuduru;
		bahcelievlerIlkokulu.mudurYardimcisi = bahcelievlerMudurYardimcisi;

		System.out.println("Mudurumuzun eski maasi: " + bahcelievlerMuduru.getMaas());
		bahcelievlerMuduru.setMaas(11000);

		System.out.println("Mudurumuzun yeni maasi: " + bahcelievlerMuduru.getMaas());

		System.out.println("Okulumuz butcesi: " + bahcelievlerIlkokulu.butce);

		bahcelievlerMuduru.setOkul(bahcelievlerIlkokulu);
		bahcelievlerMuduru.getOkul().butce = 50000;
	}

}