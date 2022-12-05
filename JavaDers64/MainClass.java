package JavaDers64;

public class MainClass {
//1-Encapsulation:Data saklama
//Disariya aktarmak istemedigimiz degiskeni "private" yapariz.
//Private: Sadece class icinden erisilebilir.
	public static void main(String[] args) {
		Ogretmen object = new Ogretmen();
		System.out.println(object.getBrans());
		System.out.println(object.getDogumTarihi());
	}

}
