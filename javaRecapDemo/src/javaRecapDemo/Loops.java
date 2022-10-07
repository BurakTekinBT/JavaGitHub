package javaRecapDemo;

public class Loops {

	public static void main(String[] args) {
				//array tanımlama 1 
				String[] krediler = {
					"Hızlı Kredi",
					"Maaşını Halkbanktan Alanlar",
					"Mutlu Emekli"
				};
				//array tanımlama 2 
				String[] krediler2 = new String[2];
				krediler2[0] = "Hızlı Kredi";
				krediler2[1] = "Maaşını Halkbanktan Alanlar";
				krediler2[2] = "Mutlu Emekli";
 
				
				
				System.out.println(krediler[0]);
				System.out.println(krediler[1]);
				System.out.println(krediler[2]);
				
				//for loops
				for(int i = 0; i< krediler.length  ; i++){
					System.out.println("For döngüsü : " + krediler[i]);
				}
				
				for(String kredi:krediler) {
					
					System.out.println("For döngüsü alternatif : " + kredi);
				}
				
				//while loops
				int i = 0;
				while( i<krediler.length) {
					System.out.println("While döngüsü : " + krediler[i]);
					i++;
				}
				
				

	}

}
