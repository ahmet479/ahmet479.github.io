package August;
import java.util.Scanner;

	public class komsudanBuyukSayi{

		public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Arrayin uzunlugunu giriniz:");
		
		int arrayUzunlugu = klavye.nextInt();
		
		int[]sayiArrayi = new int[arrayUzunlugu];
		
		for(int i=0; i<sayiArrayi.length; i++) {
			System.out.println("Lutfen" +(i+1)+ ". degeri giriniz.");
			sayiArrayi[i]=klavye.nextInt();}
		
		System.out.println("[");
		for(int i=0; i<sayiArrayi.length; i++){
			sayiArrayi[i] = klavye.nextInt();
		}
		System.out.println("]");
		
		for(int i=1; i<sayiArrayi.length-1; i++) {
			
			if(sayiArrayi[i] > sayiArrayi[i+1] && sayiArrayi[i]>sayiArrayi[i-1]){
			
			System.out.println("Index" +i+ "teki" +sayiArrayi[i]
					+ "sayisi" + "Index" +(i-1)+ "teki" + sayiArrayi[i-1]+ "sayisindan ve" 
					+ "Index" +(i+1) + "teki" +sayiArrayi[i+1] + "sayisindan daha buyuktur");
				
		}
		}	
		}
}