package forDongusuTamBolunenSayi;

import java.util.Scanner;

public class Main {

	
			//3 ve 4 e tam b�l�nen say�lar�n ortalmas�n� alan program
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("say�y� giriniz");
		int number=scanner.nextInt(),toplam=0;
		double sum=0;
		System.out.println("say�y� giriniz");
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
