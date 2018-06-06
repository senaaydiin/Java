import java.io.IOException;
import java.util.Scanner;

public class mainclass {

	
	public static void main(String[] args) {
		DosyaIslemleri Dosya = new DosyaIslemleri();
		
		try {
			Dosya.dosyaKontrolu();
			menuYazdir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 public static int arraysize;
	 public static Scanner scan = new Scanner(System.in);
	 public static boolean whileDurumu;
	 public static  void menuYazdir() throws IOException
	 {
		whileDurumu = false;
		do {
			 Oyuncu oyuncu1 = new Oyuncu();
			 //KullaniciIslemleri KI = new KullaniciIslemleri();
			 //Oyun oyun = new Oyun();
			 System.out.println("*****************");
			 System.out.println("GAME MENU\n1. Login\n2. Create new user\n3. Exit ");
			 System.out.println("*****************");
			int secilenMenu;
			String ad;
			 
			 secilenMenu = scan.nextInt();
			 
			 switch (secilenMenu) {
			 
				 case 1: System.out.println("Enter username: ");
				 	ad = scan.next();
				 	if(KullaniciIslemleri.girisYap(ad, oyuncu1)) {
				 	
				 	Oyun.oyunBaslat(oyuncu1);
				 	whileDurumu = false;
				 	}else
				 	{
				 		whileDurumu = true;
				 	}
					 break;
				 case 2: System.out.println("Enter new username: ");
				 	 ad = scan.next();
				 	KullaniciIslemleri.kullaniciOlustur(ad, oyuncu1);
				 	 
				 	 oyuncu1.setLevel(0);
				 	 oyuncu1.setZorluk("easy");
					 Oyun.oyunBaslat(oyuncu1);
					 whileDurumu = false;
					 break;
				 case 3:
					 System.out.println("Program sonlandirildi.");
					 
					 System.exit(0); 
					 break;
				 default:
					 whileDurumu = true;
					break;
			 }
			 
		}while(whileDurumu);
		 
	 }
	
}
