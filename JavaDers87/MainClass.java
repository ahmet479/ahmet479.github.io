package JavaDers87;

import java.util.HashSet;

public class MainClass {
//set(kumeler)
//HashSet:Kume mantiginda olusturulan liste	
	public static void main(String[] args) {
	HashSet liste = new HashSet();
	liste.add("Zulal");
	liste.add(100);
	liste.add(true);
	liste.add("Burak");
	liste.add("Zulal");
	System.out.println(liste);
	System.out.println(liste.contains("Zulal"));
	System.out.println(liste.contains("Ayse"));
	liste.remove("Brak");
	System.out.println(liste);
	System.out.println("Uzunluk : "+liste.size());
	String metin = liste.toString();	

/*	
-add():veri eklemek
-contains():veri kontrol
-remove :veri silmek
-size():veri sayisi
-toString: Strin
*/



	}

}
