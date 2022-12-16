package JavaDers78;

import java.util.ArrayList;

public class MainClass {
//List(listeler)
//ArrayList:Liste uzunlugu dinamiktir. Icerisinde farkli tipte datalar tutabilir.
	public static void main(String[] args) {
		ArrayList isimler = new ArrayList();
		isimler.add("Hamza");
		isimler.add("Gokhan");
		isimler.add("Ali");
		isimler.add(20);
		isimler.add("20.3f");
		
		boolean varMi = isimler.contains("Ayse");
//contains():herhangi bir datanin liste icerisinde olup olmadigini bize soyler.		
		System.out.println(isimler);
//add(): Veri eklemek icin
		
		System.out.println(isimler.get(2));
//get():Verileria almak icin
		isimler.remove(1);
//Verileri silmek icin
		System.out.println(isimler);
		System.out.println(isimler.size());		
//size():arraylist icersinde kac tane data oldugunu bize soyluyor
		
	isimler.clear();
	System.out.println(isimler);
//tum elemanlari listeden siler
	
	System.out.println("index: " + isimler.indexOf("Ali"));
//indexOf :Aranilan datanin hangi indexte oldugunu bize soyler.
	
	
	
	
	
	
	
	
	
	
	}

}
