package JavaDers88;

import java.util.TreeSet;

public class MainClass {
//set(kumeler)
//TreeSet(Sirali Kume) olustururken hem 'set' hem de sorteSed interfase'inden yararlanmis
//HashSet olustururken sadece 'ser' interface'inden yararlanmis java.
//HashSet kumeler olustururken elemanlar karisik verilir ama TreeSet olustururken harf sirasina gore siralanir.	
	public static void main(String[] args) {
		
		TreeSet liste = new TreeSet();

		liste.add("Hilal");
		liste.add("Zulal");
		liste.add("Esad");
		
		System.out.println(liste);
		liste.remove("Hilal");
		System.out.print(liste.contains("Hilal"));
		System.out.print(liste);
		System.out.print(liste.size());
		
		

	}

}
