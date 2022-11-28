package JavaDers52;

public class Car {
	public Car() {
		
		this(230);
		System.out.println("default");
	}
	public Car(int speed) {
		this(210, "blue");
		System.out.println("single");
		
	}
	public Car(int speed, String color) {
	System.out.println("dobbel");
}
}