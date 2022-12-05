package JavaDers65;
//Nesne Tabanli Programalama Prensipleri(OOP Principles)
//1-Encapsulation:Data saklama get() ve set() methodlarini kullanarak bir degiskene
// disaridan erisebilir ve istersek degiskenin degerini de degistirebiliriz.
public class MainClass {
	public static void main(String[] args) {
		Ogretmen object = new Ogretmen();
		
		System.out.println(object.getYas());
		System.out.println(object.getIsim());
		System.out.println(object.kimlikNo());
	
	}
	
}
