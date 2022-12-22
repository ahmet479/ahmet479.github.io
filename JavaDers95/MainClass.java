package JavaDers95;


import java.util.Map.Entry;
import java.util.TreeMap;

//Map(Donusum):For dongusu yardimiyla map icerisindeki datalalri kontrol etmek
public class MainClass {
	public static void main(String[] args) {
		TreeMap<String,Integer>liste= new TreeMap<>();
		liste.put("Ali", 90);
		liste.put("Mina", 80);
		liste.put("Zulal", 70);
		
//		System.out.println(liste);  //{Ali=90, Mina=80, Zulal=70}
		
		for(Entry<String,Integer> isim :liste.entrySet()){
		System.out.println(isim);
		System.out.println(isim.getKey());
		System.out.println(isim.getValue());
		System.out.println();
		}
		
	}
	
}
