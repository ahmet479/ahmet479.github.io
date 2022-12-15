package JavaDers72;

public class MainClass {
//Overload(overloading)
//Bir methodun imzasi degistilerek ayni isimde yeni bir method olusturulabilir.
	
	public static void main(String[] args) {
		int sonuc1 = toplama(20,50);
		System.out.println("sonuc1 : " + sonuc1);
		int sonuc2= toplama(30,20,10);
		System.out.println("sonuc2 : " + sonuc2);
	}
	public static int toplama(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public static int toplama(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
}
