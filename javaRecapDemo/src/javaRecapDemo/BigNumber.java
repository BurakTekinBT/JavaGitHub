package javaRecapDemo;

public class BigNumber {

	public static void main(String[] args) {
		
		int sayi1 = 5;
		int sayi2 = 45;
		int sayi3 = 13;
		//s
		int enBuyuk = sayi1;
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			enBuyuk = sayi1;
			System.out.println("En büyük sayı : " + sayi1);
		}
		else if (sayi2 > sayi3 && sayi2 > sayi1) {
			enBuyuk = sayi2;
			System.out.println("En büyük sayı : " + sayi2);
		}
		else if (sayi3 > sayi2 && sayi3 > sayi1) {
			enBuyuk = sayi3;
			System.out.println("En büyük sayı : " + sayi3);
		}
		else {
			System.out.println("Sayilar eşittir");
		}
		
		

	}

}
