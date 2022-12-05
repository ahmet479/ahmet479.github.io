package JavaDers62;

public class MainClass {

	public static void main(String[] args) {
		Footballer object = new Footballer();
		System.out.println(object.uniformNumber);
		
		object.information();
	}

}

/* A:ayni class
   B:ayni paket farkli class
   C:farkli paket miras alinma 
   D:her yerden
             A  B  C  D
   private  :+  -  -  -
   default  :+  +  -  -
   protected:+  +  +  -
   public   :+  +  +  +

*/