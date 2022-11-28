package JavaDers51;

public class MainClass {

	public static void main(String[] args) {
		Araba object = new Araba(200, "blue");
		
		System.out.println(object.color);
		System.out.println(object.speed);

		Araba object2 = new Araba(180,"al");
		
		System.out.println(object2.speed);
		System.out.println(object2.color);

	}

}
