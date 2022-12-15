package JavaDers73;

public class MainClass {
/*interface
 * interface'den nesne uretilemez.
 * miras alinarak (implements)kullanilir.
 * extends ifsdesiyle degil, implements ifadesiyle miras alinir
 *bir class birden fazla interface'i miras alabilir ama birden fazla class'i miras ALAMAZ.
 *interface icerisindeki methodlar arasinda public abstract methodlardir.
 *interface icerisindeki degiskenlerin degerlerisonrsdan degistirilemez(final degisken)	
*/
	public static void main(String[] args) {
Car object = new Car();
object.bilgi();
object.modelBilgileri();
	}

}
