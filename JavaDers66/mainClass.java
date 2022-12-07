package JavaDers66;

public class mainClass {
	
//Nesne Tabanli Programlama Prensipleri
//2-Inheritance: Kalitim(Miras Birakma)
// extends Calisan
	public static void main(String[]args) {
		
		Teacher object = new Teacher();
		System.out.println(object.isim);
		System.out.println(object.brans);
		System.out.println(object.bilgi);
		object.deneme();
		
		Manager object1 = new Manager();
		System.out.println(object1.bilgi);
		
	
	}
	
}
