package JavaDers89;

import java.util.HashSet;
import java.util.TreeSet;

public class MainClass {
//Set<>
//List<>	
//Set(Kumeler)	
//HashSet ve TreeSet yapilarinda ayni tipte veri tutmak
	public static void main(String[] args) {
		HashSet<Integer> liste1 = new HashSet<>();
		liste1.add(100);
		liste1.add(200);
		liste1.add(300);
		liste1.add(400);
		
		TreeSet<String> liste2 = new TreeSet<>();
		liste2.add("Emine");
		liste2.add("Ahmet");
		liste2.add("Mina");
		
		System.out.println(liste1);
		System.out.println(liste2);
	}
//Not:HashSet'te kume elemanlari karsik TreeSet'te elemanlar harf sirasina gore verilir.
}
