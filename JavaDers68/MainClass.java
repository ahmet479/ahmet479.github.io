package JavaDers68;

public class MainClass {
//Nesne Tabanli Programlama Prensipleri(OOP Prensipleri)
//3-Polimorphism:Bir nesnenin birden fazla farkli nesneymis gibi davranabilmesi
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Cat cat = new Cat();
		Animal cat2 = new Animal();
		
		
		animal1.konus();
		cat.konus();
		cat2.konus();
	}

}
