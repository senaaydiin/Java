
public class Oyun {

	
	 public static void oyunBaslat(Oyuncu oyuncu)
	 {
		
		 int devamSecimi=0; boolean devamDurumu=true;
		 
		
		 
		 do {
			 oyuncu.grid = new String[mainclass.arraysize][mainclass.arraysize];
			 System.out.println("Oyun Baslatildi");
			 System.out.println("Oyuncu: " + oyuncu.getIsim() + " Zorluk: " + oyuncu.getZorluk() + " Level: " +  oyuncu.getLevel());
			 
			 Grid.gridOlustur(oyuncu.grid,oyuncu.getZorluk());
			 //Grid.gridYazdir(oyuncu.grid);
			 Grid.gridSonYazdir(oyuncu.grid);
			 
			 do {
				 
				 Silah.atesEt(Silah.silahYazdir(oyuncu), oyuncu);
				 Gemi.gemiVurulmaKontrolu(oyuncu);
				 if(bitisKontrolu(oyuncu))
				 {
					 //Oyuncunun leveli degisecek
					 levelDegistir(oyuncu);
					 break;
				 }
				 if(!Silah.silahlarinKontrolu(oyuncu))
				 {
					
					break;
				 }
			 
			 
			 }while(true);
			 
			 
			 System.out.println("\n0. Evet\n1. Hayir");
			 System.out.println("Devam etmek istiyor musunuz?");
			 devamSecimi= mainclass.scan.nextInt();
			 if(devamSecimi==1) devamDurumu=false;
			 
		 }while(devamDurumu);
		 
		 System.out.println("Program Sonlandirildi.");
		 //Kullanicinin son durumu dosyaya yazilacak
		 DosyaIslemleri.dosyaGuncelleme(oyuncu);
		 
	 }
	 public static boolean bitisKontrolu(Oyuncu oyuncu)
	 {
		 int sayac=0;
		 for(int i=0; i<oyuncu.grid.length;i++)
		 {
			
			 for(int j=0; j<oyuncu.grid.length;j++)
			 {
				 if(oyuncu.grid[i][j].equals("1") || oyuncu.grid[i][j].equals("2") || oyuncu.grid[i][j].equals("3") || oyuncu.grid[i][j].equals("4") ) sayac++;
			 }
			 
		 }
		 if(sayac==0) 
		{
			 System.out.println("Tebrikler, tum gemileri vurdunuz.");
			 return true;
		}
			 
		 
		 return false;
	 }
	 
	 public static void levelDegistir(Oyuncu oyuncu)
	 {
		 if(oyuncu.getZorluk().equals("easy") && oyuncu.getLevel()==1)
		 {
			 oyuncu.setZorluk("normal");
			 oyuncu.setLevel(0);
			 mainclass.arraysize=15;
		 }
		 else if(oyuncu.getZorluk().equals("normal") && oyuncu.getLevel()==2)
		 {
			 oyuncu.setZorluk("hard");
			 oyuncu.setLevel(0);
			 mainclass.arraysize=20;
		 }else {
			 oyuncu.setLevel(oyuncu.getLevel()+1);
		 }
	 }
}
