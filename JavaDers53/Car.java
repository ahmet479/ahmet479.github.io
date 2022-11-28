package JavaDers53;

public class Car {
	int model = 2020;
	int speed = 999;
	int speedOfTheCar;
	String carColor;
/*	public Car() {
		this(200, "blue");
	System.out.println("default");
	}
	public Car(int speed) {
		this();
		System.out.println("single");	
	}   */
	public Car(int speed, String color) {
		speedOfTheCar =speed;
		carColor = color;
	//	System.out.println("dobbel");
		System.out.println("constructor: "+this.speed);
		System.out.println("constructor: "+this.model);

	}

}
 