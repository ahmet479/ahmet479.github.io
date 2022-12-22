package JavaDers92;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		HashMap liste = new HashMap();
		liste.put("Hilal", 90);
		liste.put("Feride", 86);
		liste.put("Ahmet", 79);
		
		System.out.println(liste);  //{Feride=86, Hilal=90, Ahmet=79}
	//put():key, value seklinde data eklenir.	
		System.out.println(liste.containsKey("Ahmet"));  //true
	//containsKey():anahtarin varligi kontrol edilir	
		System.out.println(liste.containsValue(86)); //true
	//containsValue():degerin varligi kontrol edilir.	
		System.out.println("Entry Set : " + liste.keySet()); //Entry Set : [Feride, Hilal, Ahmet]
		 
		liste.remove("Feride");
		System.out.println(liste); //{Hilal=90, Ahmet=79}
	//remove(): veriyi silmek icin kullanilir
		System.out.println(liste.size());  //2
	//size():veri sayisini ogrenebiliyoruz.	
		
		
	}

}
