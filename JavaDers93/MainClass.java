package JavaDers93;

import java.util.TreeMap;

public class MainClass {
//TreeMap : Sirali Map
//TreeMap anahtar kelimesine gore siralama yapar	
	public static void main(String[] args) {
		TreeMap liste =new TreeMap();
		liste.put("Veli", 90);
		liste.put("Ahmet", 50);
		liste.put("Emine", 80);
		liste.put("Mina", 70);
		
		System.out.println(liste);  //{Ahmet=50, Emine=80, Mina=70, Veli=90}
		
		

	}

}
