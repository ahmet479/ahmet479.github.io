package JavaDers80;

import java.util.ArrayList;
import java.util.List;



//istenilen index'e veri eklemek ya da istenilen index'ten data cikarmak 
public class MainClass {
	public static void main(String[] args) {
		List<String>liste = new ArrayList<>();
		
		liste.add("Hamza");
		liste.add("Berk");
		liste.add("Erdal");
		liste.add(0, "Ayse");
		liste.add(2, "Burak");
		
		liste.remove(2);
		
		System.out.println(liste);
	
	
	
	}

}
