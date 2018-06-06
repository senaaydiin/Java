
public class Silah {
	public static int[] silahlar;
	
	public static boolean silahKontrolu(int silahTuru) {
		 if(silahTuru<0 || silahTuru>2) {
			 System.out.println("Gecersiz silah. Lutfen gecerli bir silah turu seciniz.\n");
			 return false;
		 }else if(silahlar[silahTuru]==0) {
			 System.out.println("Secili silahin cephanesi kalmamistir.\n");
			 return false;
		 }
		 
		 return true;
	 }
	
	 public static int[] silahYazdir(Oyuncu oyuncu) {
		 int silahTuru, xEkseni, yEkseni, yataymi;
		 yataymi=0;
		 do {
		 if(silahlar[0]!=0)System.out.println("0. Rocket " + silahlar[0]);
		 if(silahlar[1]!=0)System.out.println("1. Hand Bomb " + silahlar[1]);
		 if(silahlar[2]!=0)System.out.println("2. Gun Shot " + silahlar[2]);
		 System.out.println("Select weapon: ");
		 silahTuru = mainclass.scan.nextInt();
		 }while(!silahKontrolu(silahTuru));
		 
		 if(silahTuru==1)
		 {	do {
			 System.out.println("0. Dikey");
			 System.out.println("1. Yatay");
			 System.out.println("Atis yapilacak duzlemi seciniz:");
			 yataymi = mainclass.scan.nextInt();
		 	}while(!duzlemKontrolu(yataymi));
		 }
		 
		 do{
			 System.out.println("X coordinate to shoot: ");
			 xEkseni = mainclass.scan.nextInt();
			 System.out.println("Y coordinate to shoot: ");
			 yEkseni = mainclass.scan.nextInt();
		 }while(!koordinatKontrolu(xEkseni,yEkseni,oyuncu.grid.length));
		 
		 int[] bilgiler = new int[] {silahTuru,xEkseni,yEkseni,yataymi };
		 return bilgiler;
	 }
	 
	 public static void atesEt(int[] atisBilgileri,Oyuncu o) {
		 	
		 if(atisBilgileri[0]==0) {//Rocket
			 int atisSayaci=0;
				 for(int i=atisBilgileri[2]-1; i<atisBilgileri[2]+2;i++)
				 {
					 if(i<0||i>o.grid.length-1) { continue; }
					 else {
						 
						 if(o.grid[i][atisBilgileri[1]].equals("X")) 
						 {
							 continue;
						 }
						 else if(o.grid[i][atisBilgileri[1]].equals("1") || o.grid[i][atisBilgileri[1]].equals("2") ||o.grid[i][atisBilgileri[1]].equals("3") ||o.grid[i][atisBilgileri[1]].equals("4") )
						 {
							 o.grid[i][atisBilgileri[1]]="X"; atisSayaci++;
						 }
						 else {
							 
							 o.grid[i][atisBilgileri[1]]="-";
							
							 
						 }
					 }
				 }
				 for(int i=atisBilgileri[1]-1; i<atisBilgileri[1]+2;i++)
				 {
					 if(i<0||i>o.grid.length-1) { continue; }
					 else {
						 
						 if(o.grid[atisBilgileri[2]][i].equals("X")) 
						 {
							 continue;
						 }
						 else if(o.grid[atisBilgileri[2]][i].equals("1") || o.grid[atisBilgileri[2]][i].equals("2") || o.grid[atisBilgileri[2]][i].equals("3") || o.grid[atisBilgileri[2]][i].equals("4"))
						 {
							 o.grid[atisBilgileri[2]][i]="X"; atisSayaci++;
						 }
						 else {
							 
							 o.grid[atisBilgileri[2]][i]="-";
							 
						 }
					 }
				 }
				 
				 if(atisSayaci==0) System.out.println("\n***** Bos atis yaptiniz. *****");
				 
			 
			 
			 silahlar[0]--;
		 }else if(atisBilgileri[0]==1) {//Hand Bomb
			 
			
			 if(atisBilgileri[3]==0){//dikey
				 
				 int atisSayaci=0;
				 for(int i=atisBilgileri[2]-1; i<atisBilgileri[2]+2;i++)
				 {
					 if(i<0||i>o.grid.length-1) {atisSayaci++; continue; }
					 else {
						 
						 if(o.grid[i][atisBilgileri[1]].equals("X")) 
						 {
							 atisSayaci++;
						 }
						 else if(o.grid[i][atisBilgileri[1]].equals("1") || o.grid[i][atisBilgileri[1]].equals("2") || o.grid[i][atisBilgileri[1]].equals("3") || o.grid[i][atisBilgileri[1]].equals("4") )
						 {
							 o.grid[i][atisBilgileri[1]]="X";
						 } 
						 else {
							 
							 o.grid[i][atisBilgileri[1]]="-";
							 atisSayaci++;
							 
						 }
					 }
				 }
				 if(atisSayaci==3) System.out.println("\n***** Bos atis yaptiniz. *****");
				 
			 }else {//yatay
				 int atisSayaci=0;
				 for(int i=atisBilgileri[1]-1; i<atisBilgileri[1]+2;i++)
				 {
					 if(i<0||i>o.grid.length-1) {atisSayaci++; continue; }
					 else {
						 
						 if(o.grid[atisBilgileri[2]][i].equals("X")) 
						 {
							 atisSayaci++;
						 }
						 else if(o.grid[atisBilgileri[2]][i].equals("1") || o.grid[atisBilgileri[2]][i].equals("2") || o.grid[atisBilgileri[2]][i].equals("3") || o.grid[atisBilgileri[2]][i].equals("4"))
						 {
							 o.grid[atisBilgileri[2]][i]="X";
						 }
						 else {
							 
							 o.grid[atisBilgileri[2]][i]="-";
							 atisSayaci++;
						 }
					 }
				 }
				 if(atisSayaci==3) System.out.println("\n***** Bos atis yaptiniz. *****");
			 }
			 
			 silahlar[1]--;
		 }else {// Gun Shot
			 if(o.grid[atisBilgileri[2]][atisBilgileri[1]].equals("X")) 
			 {
				 System.out.println("\n***** Vurulmus yeri tekrar vurdunuz. *****");
			 }
			 else if(o.grid[atisBilgileri[2]][atisBilgileri[1]].equals("1") || o.grid[atisBilgileri[2]][atisBilgileri[1]].equals("2") || o.grid[atisBilgileri[2]][atisBilgileri[1]].equals("3") || o.grid[atisBilgileri[2]][atisBilgileri[1]].equals("4"))
			 {
				 o.grid[atisBilgileri[2]][atisBilgileri[1]]="X";
			 }
			 else {
				 
				 o.grid[atisBilgileri[2]][atisBilgileri[1]]="-";
				 System.out.println("\n***** Bos atis yaptiniz. *****");
			 }
			 silahlar[2]--;
		 }
		 //Grid.gridYazdir(o.grid);
		 Grid.gridSonYazdir(o.grid);
	 }
	 
	 public static boolean duzlemKontrolu(int duzlem) {
		 
		 if(duzlem<0 || duzlem>1) {
			 System.out.println("Gecersiz duzlem. Lutfen gecerli bir duzlem seciniz.\n");
			 return false;
		 }
		 
		 return true;
	 
	 }
	 
	 public static boolean koordinatKontrolu(int xEkseni, int yEkseni, int uzunluk) {
		 
		 if(xEkseni<0 || xEkseni>uzunluk-1 || yEkseni<0 || yEkseni>uzunluk-1 ) {
			 System.out.println("Gecersiz koordinat. Lutfen gecerli bir koordinat seciniz.\n");
			 return false;
		 }
		 
		 return true;
	 
	 }
	 
	 public static boolean silahlarinKontrolu(Oyuncu o)
	 {
		if(silahlar[0]==0 && silahlar[1]==0 && silahlar[2]==0)
		{	Grid.gridSonYazdir(o.grid);
			System.out.println("\n***** Oyun bitti. Tum cephaneniz tukendi. *****");
			return false;
		}
		 return true;
	 }
}
