
public class Grid {

		
	 public static void gridOlustur(String[][] grid, String zorluk) {
		 int[] gemiler;
		 if(zorluk.equals("easy") ){//grid = new String[10][10];
		 	gemiler = new int[] {1,1,1,0};
		 	Silah.silahlar = new int[] {1,2,7} ;
		 	 Gemi.battleship=0;
		 	 Gemi.boat=1;
		 	 Gemi.destroyer=1;
		 	 Gemi.submarine=1;
		 	Gemi.gemiYerlestir(grid, gemiler);
		 	
		 }
		 else if(zorluk.equals("normal") ){ //grid = new String[15][15];
			 gemiler = new int[] {2,1,1,1};
			 Silah.silahlar = new int[] {1,3,10} ;
			 Gemi.battleship=1;
		 	 Gemi.boat=2;
		 	 Gemi.destroyer=1;
		 	 Gemi.submarine=1;
			 Gemi.gemiYerlestir(grid, gemiler);
			
		 }
		 else { //grid = new String[20][20];
			 gemiler = new int[] {2,1,1,1};
			 Silah.silahlar = new int[] {1,4,12} ;
			 Gemi.battleship=1;
		 	 Gemi.boat=2;
		 	 Gemi.destroyer=1;
		 	 Gemi.submarine=1;
			 
			 Gemi.gemiYerlestir(grid, gemiler);
			
		 }
	 }
	 
	 public static void gridDoldur(String[][] grid) {
			 
			 for(int i=0; i<grid.length;i++)
			 {
				 for(int j=0; j<grid.length;j++)
				 {
					 grid[i][j]=".";
				 }
			 }
			 
	}
	 
	 public static final void gridYazdir(String[][] grid) {
		 
		 System.out.println("\nRemaining Ships:\nBoat(s): " + Gemi.boat +"\nSubmarine: " + Gemi.submarine + "\nDestroyer: " + Gemi.destroyer + "\nBattleship: " + Gemi.battleship +"\n");
		 if(grid.length==10) System.out.println("   0  1  2  3  4  5  6  7  8  9");
		 else  if(grid.length==15) System.out.println("   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14");
		 else System.out.println("   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19");
		 for(int i=0; i<grid.length;i++)
		 {
			 if(i<10)
			 System.out.print(i + "  ");
			 else System.out.print(i + " ");
			 for(int j=0; j<grid.length;j++)
			 {
				 //Gemilerin gizlenecegi yer
				 if(grid[i][j].equals("1") || grid[i][j].equals("2") || grid[i][j].equals("3") || grid[i][j].equals("4") )System.out.print("." + "  ");
				 else System.out.print(grid[i][j] + "  ");
			 }
			 System.out.println("");
		 }
	 }
	 
	 public static final void gridSonYazdir(String[][] grid) {
		 
		 System.out.println("\nRemaining Ships:\nBoat(s): " + Gemi.boat +"\nSubmarine: " + Gemi.submarine + "\nDestroyer: " + Gemi.destroyer + "\nBattleship: " + Gemi.battleship +"\n");
		 if(grid.length==10) System.out.println("   0  1  2  3  4  5  6  7  8  9");
		 else  if(grid.length==15) System.out.println("   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14");
		 else System.out.println("   0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19");
		 for(int i=0; i<grid.length;i++)
		 {
			 if(i<10)
			 System.out.print(i + "  ");
			 else System.out.print(i + " ");
			 for(int j=0; j<grid.length;j++)
			 {
				 //Gemilerin gizlenecegi yer
				 //if(grid[i][j].equals("1") || grid[i][j].equals("2") || grid[i][j].equals("3") || grid[i][j].equals("4") )System.out.print("." + "  ");
				// else 
					 System.out.print(grid[i][j] + "  ");
			 }
			 System.out.println("");
		 }
	 }
}
