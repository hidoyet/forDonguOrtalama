package forDongusuTamBolunenSayi;

import java.util.Scanner;

public class Main {

	
			//3 ve 4 e tam bölünen sayýlarýn ortalmasýný alan program
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("sayýyý giriniz");
		int number=scanner.nextInt(),toplam=0;
		double sum=0;
		System.out.println("sayýyý giriniz");
		for(int i=0;i<=number;i++) {
			if(i%3==0&&i%4==0) {
				int kontrol=1;
				toplam=toplam+i;				
				kontrol++;
				sum=toplam/kontrol;
			}
			
			
		}
		System.out.println(sum);
	}

}
