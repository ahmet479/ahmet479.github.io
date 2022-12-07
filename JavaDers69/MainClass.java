package JavaDers69;

public class MainClass {
//Nesne Tabanli Programlama Prensipler(OOP Prensipleri)
//4-Abstraction(soyutlama)
//***Abstract class'lardan "NESNE" olusturulamaz ama miras alinabilir.
//Abstract method olusturulabilir ancak sadeceabstract class icerisinde 
//***abstract method olusturulabilir ANCAK sadece abstract class icerisinde.	
//***eger bir abstract class miras alinirsa o class icerisindeki abstract method'lar (override) class'a eklenmk zorunda 
//**abstract class'lar abstract olmayan method'lari da barindirabilir
//**abstract methodlar STATIC OLAMAZlar.
	public static void main(String[] args) {
		Bird object1 = new Bird();
//		Live object2 = new Live();
		Live object3 = new Bird();
		object1.konus();
		Cat object2 = new Cat();
		object2.konus();
		object1.bilgiYazdir();
		
	}

}
