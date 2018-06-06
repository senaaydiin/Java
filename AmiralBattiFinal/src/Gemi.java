
public class Gemi {

	public static int boat;
	public static int submarine;
	public static int destroyer;
	public static int battleship;
	
	 public static void gemiYerlestir(String[][] grid, int[] gemiler) {
			 
		 	 Grid.gridDoldur(grid);
			 int yEkseni;
			 int xEkseni;
			 int yataymi;
			 
			 for(int i=0; i<4;i++)
			 {
				 for(int j=0; j<gemiler[i];j++)
				 {
					 do {
						 yataymi = (int)(Math.random()*2);
						 if(yataymi==0)
						 {
							  yEkseni = (int)(Math.random()*(grid.length-i));
							  xEkseni = (int)(Math.random()*(grid.length));
						 }else {
							  xEkseni = (int)(Math.random()*(grid.length-i));
							  yEkseni = (int)(Math.random()*(grid.length));
							  
						 }
						 
						 }while(!gemiYerlestirmeKontrolu(grid,yataymi,yEkseni,xEkseni,i+1));
						 yerlestir(grid,yataymi,yEkseni,xEkseni,i+1);
					
				 }
			 }
			
			 
		 }
	 
	 public static void yerlestir(String[][]  grid,int yataymi, int yEkseni, int xEkseni, int gemiBoyutu) {
		 
		 	String gemi = String.valueOf(gemiBoyutu);
		 if(yataymi==0) {//dikey yerlestirme kontrolu
			 for(int i=yEkseni; i<yEkseni+gemiBoyutu; i++)
			 {
				 //grid[i][xEkseni]="S";
				 grid[i][xEkseni]=gemi;
				 
			 }
			 
		 }else {//yatay yerlestirme kontrolu
			 for(int j=xEkseni; j<xEkseni+gemiBoyutu; j++)
			 {
				 //grid[yEkseni][j]="S";
				 grid[yEkseni][j]=gemi;
				
			 }
			 
		 }
	}
	
	
	public static boolean gemiYerlestirmeKontrolu(String[][]  grid,int yataymi, int yEkseni, int xEkseni, int gemiBoyutu) {
		 
		 if(yataymi==0) {//dikey yerlestirme kontrolu
			 for(int i=yEkseni; i<yEkseni+gemiBoyutu; i++)
			 {
				 if(!grid[i][xEkseni].equals("."))
				 {
					 return false;
				 }
			 }
			 
		 }else {//yatay yerlestirme kontrolu
			 for(int j=xEkseni; j<xEkseni+gemiBoyutu; j++)
			 {
				 if(!grid[yEkseni][j].equals("."))
				 {
					 return false;
				 }
			 }
			 
		 }
		 
		 return true;
	}
	 
 
	public static void gemiVurulmaKontrolu(Oyuncu oyuncu)
	{
		int gemiSayaci1=0; int gemiSayaci2=0; int gemiSayaci3=0; int gemiSayaci4=0;
		 for(int i=0; i<oyuncu.grid.length;i++)
		 {
			
			 for(int j=0; j<oyuncu.grid.length;j++)
			 {
				 if(oyuncu.grid[i][j].equals("1")) gemiSayaci1++;
				 else if(oyuncu.grid[i][j].equals("2")) gemiSayaci2++;
				 else if(oyuncu.grid[i][j].equals("3")) gemiSayaci3++;
				 else if(oyuncu.grid[i][j].equals("4")) gemiSayaci4++;
			 }
			 
		 }
		 
		 if(oyuncu.getZorluk().equals("easy"))
		 {
			 if(gemiSayaci1==0 && gemiSayaci3==0 && boat!=0 && destroyer!=0)
			 {
				 boat--;
				 destroyer--;
				 System.out.println("\n***** YOU SUNK A DESTROYER AND A BOAT *****\n");
			 }else if(gemiSayaci1==0 && gemiSayaci2==0 && boat!=0 && submarine!=0)
			 {
				 boat--;
				 submarine--;
				 System.out.println("\n***** YOU SUNK A SUBMARINE AND A BOAT *****\n");
			 }else if(gemiSayaci1==0  && boat!=0 )
			 {
				 boat--; 
				 System.out.println("\n***** YOU SUNK A BOAT *****\n");
			 }else if(gemiSayaci2==0  && submarine!=0 )
			 {
				 submarine--;
				 System.out.println("\n***** YOU SUNK A SUBMARINE *****\n");
			 }else if(gemiSayaci3==0  && destroyer!=0 )
			 {
				 destroyer--;
				 System.out.println("\n***** YOU SUNK A DESTROYER *****\n");
			 }
			 
		 }else  if(oyuncu.getZorluk().equals("normal") || oyuncu.getZorluk().equals("hard"))
		 {
			 
			 if(gemiSayaci1==0 && gemiSayaci3==0 && boat==2 && destroyer!=0)
			 {
				 boat--;
				 boat--;
				 destroyer--;
				 System.out.println("\n***** YOU SUNK A DESTROYER AND TWO BOAT *****\n");
			 }else if(gemiSayaci1==0 && gemiSayaci2==0 && boat==2 && submarine!=0)
			 {
				 boat--;
				 boat--;
				 submarine--;
				 System.out.println("\n***** YOU SUNK A SUBMARINE AND TWO BOAT *****\n");
			 }else if(gemiSayaci1==0 && boat==2)
			 {
				 boat--;
				 boat--;
				 System.out.println("\n***** YOU SUNK TWO BOAT *****\n");
			 }else if(((gemiSayaci1==0 && boat==1) || (gemiSayaci1==1  && boat==2 )) && gemiSayaci2==0 && submarine!=0 )
			 {
				 boat--;
				 submarine--;
				 System.out.println("\n***** YOU SUNK A SUBMARINE AND A BOAT *****\n");
			 }else if(((gemiSayaci1==0 && boat==1) || (gemiSayaci1==1  && boat==2 )) && gemiSayaci3==0 && destroyer!=0 )
			 {
				 boat--;
				 destroyer--;
				 System.out.println("\n***** YOU SUNK A DESTROYER AND A BOAT *****\n");
			 }
			 else if((gemiSayaci1==0 && boat==1) || (gemiSayaci1==1  && boat==2 ))
			 {
				 boat--; 
				 System.out.println("\n***** YOU SUNK A BOAT *****\n");
			 }else if(gemiSayaci2==0  && submarine!=0 )
			 {
				 submarine--;
				 System.out.println("\n***** YOU SUNK A SUBMARINE *****\n");
			 }else if(gemiSayaci3==0  && destroyer!=0 )
			 {
				 destroyer--;
				 System.out.println("\n***** YOU SUNK A DESTROYER *****\n");
			 }else if(gemiSayaci4==0  && battleship!=0 )
			 {
				 battleship--;
				 System.out.println("\n***** YOU SUNK A DESTROYER *****\n");
			 }
			 
		 }
		 
		 
	}
 
}
