import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class KullaniciIslemleri {

	

	 public static boolean girisYap(String ad, Oyuncu oyuncu) throws IOException
	 {
		 boolean kullaniciDurumu = false;
		 String kullaniciBilgileri =null;
		
		 File file = new File("AmiralBattiInfo.txt");
		 BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine()) != null)
			{
			    if(line.contains(ad)) {
			    	kullaniciDurumu = true;
			    	kullaniciBilgileri=line;
			    	break;
			    }
			    
			}
			in.close();
			if(!kullaniciDurumu)
			{
				System.out.println("Bu kullanici mevcut degil.");
				return false;
				
			}else 
				{
				
					oyuncu.setIsim(ad);
					String slevel=kullaniciBilgileri.substring(kullaniciBilgileri.indexOf("(")+1,kullaniciBilgileri.indexOf(")"));
					int level=Integer.parseInt(slevel);
					oyuncu.setLevel(level);
					String zorluk = kullaniciBilgileri.substring(kullaniciBilgileri.indexOf(" ")+1, kullaniciBilgileri.lastIndexOf("("));
					oyuncu.setZorluk(zorluk);
					if(oyuncu.getZorluk().equals("easy")) mainclass.arraysize = 10;
					 else if(oyuncu.getZorluk().equals("normal"))  mainclass.arraysize = 15;
					 else  mainclass.arraysize = 20;
					return true;
				
				}
			
	 }
	 
	 public static void kullaniciOlustur(String ad, Oyuncu oyuncu) throws IOException
	 {
		 boolean kullaniciDurumu = false;
		 File file = new File("AmiralBattiInfo.txt");
		 BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine()) != null)
			{
			    if(line.contains(ad)) {
			    	kullaniciDurumu = true;
			    	break;
			    }
			    
			}
			in.close();
			if(kullaniciDurumu)
			{
				System.out.println("Bu kullanici mevcut. Lutfen baska bir isim giriniz: ");
		    	String yeniad = mainclass.scan.next();
		    	kullaniciOlustur(yeniad, oyuncu);
			}
			else {
				 String kullaniciBilgileri = "\n"+ad + " easy(0)";
				 FileWriter yazici = new FileWriter(file,true);
                 BufferedWriter yaz = new BufferedWriter(yazici);
                 yaz.write(kullaniciBilgileri);
                 yaz.close();
                 oyuncu.setIsim(ad);
                 mainclass.arraysize = 10;
                 System.out.println("Kullanici basariyla olusturuldu.");
			}
	 }
	
}
