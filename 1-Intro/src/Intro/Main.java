package Intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

        //Java'da değişken adı camelCase olarak yazılır.
		
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";
        

        System.out.println(ortaMetin);

        //integer (Tamsayı)
        int vade = 12;
        
        System.out.println(altMetin + " : " + vade);
        
        //double (Ondalık Sayı)
        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;


        String okYonu = "";
        
        //Koşullu İfadeler
        if(dolarBugun<dolarDun) { //false
            okYonu = "down.svg";
            System.out.println(okYonu);
            System.out.println("Dolar düştü");
        } else if (dolarBugun>dolarDun){
            okYonu="up.svg";
            System.out.println(okYonu);
            System.out.println("Dolar Yükseldi");
        }else {
            okYonu="equal.svg";
            System.out.println("Dolar eşit");
        }


        // array (Diziler, Listeler)
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);


        // For döngüsü - büyük veri listelerinde tekrar eden işlemlerde kullanılır.
        for(int i =0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }
        
        

	}

}
