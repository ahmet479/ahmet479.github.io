package JavaDers90;

import java.util.HashSet;

//Set(Kumeler)
//HashSet ve TreeSet icerisindki verileri for yardimiyla gorm
public class MainClass90 {
	public static void main(String[] args) {
//forEach		
		HashSet<String> liste = new HashSet(); 
		liste.add("Ahmet");
		liste.add("Mina");
		liste.add("Emine");
		
		for(String isim:liste) {
			System.out.println(isim);
		}
	}

}
