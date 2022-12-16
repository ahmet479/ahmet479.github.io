package JavaDers79;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
	ArrayList<String> isimler= new ArrayList<>();
	isimler.add("Hamza");
	isimler.add("Kerem");
	
	System.out.println(isimler);
	
	ArrayList<Integer> sayilar = new ArrayList<>();
	}
}
/* ArrayList:
 * liste uzunlugu dinamiktir.
 *icerisinde farkli uzunlukta datalar tutabilir
 -isaretleri icerisinde liste icerisinde tutmak istedigimiz veri tipini yazabiliriz. eger ilkel veri tipini eklemek istersek (tam sayi boolean gibi) o zaman primitive data type'ler icin wrapper classlarini kullanmaliyiz.
 int     ->Integer
 boolean->Boolean
 float   ->Float
 byte    ->Byte
 */