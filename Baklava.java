package August;
import java.util.Scanner;
public class Baklava {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz:");
		
		int sayi = klavye.nextInt();
		
	for(int i=0; i<sayi; i++) {
		for(int j= 1; j<sayi-1; j++) {
			System.out.print(" ");
		}		
		
		for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");}
	{
		for(int i=1; i<sayi; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
			for(int k=0; k<sayi-1; k++) {
				System.out.println("*");
			}
			System.out.println(" ");
		}
	}
		}		
	}

