package JavaDers94;

import java.util.HashMap;

//HashMap ve TreeMap icerisine eklenen verilerin tiplerini belirleme.
public class MainClass {
public static void main(String[] args) {
	HashMap<String,Integer>liste = new HashMap<>();
	liste.put("Ahmet", 20);
	liste.put("Esad", 30);
	liste.put("Emine", 40);
	
	System.out.println(liste);  //{Esad=30, Ahmet=20, Emine=40}
	
}
	
}
