package javaRecapDemo;

public class switchCase {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break; //break işi bitirir caseden çıkartır.
		case 'B':
		case 'C': // B ve C aynı çıktıyı verir
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}

	}

}