package JavaDers55;
//ststic anahtar kelimesi
//-Degisken
//Method
// Class*
//Hafiza yonetimi icin kullanir. Static kelimesinin kullanildigi degisken hafizada sadece 1 kez olusturulur.
//Madem static degisken sadece bir kez olusturuluyor, o zaman bir nesnenin static degiskenin degeri degistirilirse 
//tum nesnelerin degiskenin degeri de degismis olur.
public class MainClass {
	public static void main(String[] args) {
		Car object1 = new Car(200, "black", 6);
		System.out.println(object1.gear);
		
		Car object2 = new Car(220, "green", 5);
		System.out.println(object2.speed);
		
		
	//	Car object3 = mew Car(150, "blue", 6);
	//	System.out.println(object3.color);
		
		System.out.println(Car.model);
		
		Car.information();

		
		
		
		
		
/*		Car object1 = new Car(200, "black", 6);
		
		System.out.println(object1.color);
		System.out.println(object1.speed);
		System.out.println(object1.gear);
		System.out.println(object1.model);

		Car object2 = new Car(220, "green", 5);
		System.out.println(object2.color);
		System.out.println(object2.speed);
		System.out.println(object2.gear);
		System.out.println(object2.model);
		
		Car object3 = new Car(150, "blue", 6);
		System.out.println(object3.color);
		System.out.println(object3.speed);
		System.out.println(object3.gear);
		System.out.println(object3.model);
*/	
	}

	private static void Car(int i, String string, int j) {
		// TODO Auto-generated method stub
		
	}

}
