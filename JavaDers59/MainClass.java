package JavaDers59;

public class MainClass {
//Access Medifiers:private
//Sadece ayni class icerisinde erisim izni verir.
	public static void main(String[] args) {
		Teacher object = new Teacher();
		
		System.out.println(object.name);
		System.out.println(object.age);
		
		object.ettempt();

	}

}
