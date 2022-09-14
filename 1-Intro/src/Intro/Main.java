package Intro;

public class Main {

	public static void main(String[] args) {
		// Gazamız mübarek olsun
		System.out.println("Hello World!");

		// Değişken isimlendirmeleri Java'da camelCase yazılır.
		// String veri tipi (Metinsel veri tipi)
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade süresi";
		System.out.println(ortaMetin);
		
		//integer veri tipi (tam sayı)
		int vade = 12;
		System.out.println(altMetin + "	: " + vade);
		
		//double veri tipi (ondalık sayı)
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		System.out.println("Doların dünkü fiyatı	: " + dolarDun);
		System.out.println("Doların bugünkü fiyatı	: " +dolarBugun);
		
		System.out.println("------------------------------------------------------------");
		
		// Boolean
		boolean dolarDustuMu;
		
		
		String okYonu = "";
		
		
		// Koşullu ifadeler
		if (dolarBugun < dolarDun) {
			dolarDustuMu = true;
			okYonu = "down.svg";
			System.out.println("Dolar düştü.");
			System.out.println(okYonu);
			
		}else if (dolarBugun == dolarDun) {
			dolarDustuMu = false;
			System.out.println("Dolar eşit.");

		}else {
			dolarDustuMu = false;
			okYonu = "up.svg";
			System.out.println("Dolar yükseldi.");
			System.out.println(okYonu);
		}
		
		System.out.println("Dolar durumu: " + dolarDustuMu);
		
		System.out.println("------------------------------------------------------------");
		
		 // Diziler, Listeler
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
        
        System.out.println("------------------------------------------------------------");
        
        for(int i =0; i<krediler.length; i++){
            System.out.println(krediler[i]); 
            }
		
		
	}

}
