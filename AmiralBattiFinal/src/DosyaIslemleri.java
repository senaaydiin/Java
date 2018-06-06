import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaIslemleri {
	
	public DosyaIslemleri() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public  void dosyaKontrolu() throws IOException
	 {
		 File file = new File("AmiralBattiInfo.txt");
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	 }
	 
	 public static void dosyaGuncelleme(Oyuncu oyuncu) {
		 File inputFile = new File("AmiralBattiInfo.txt");
		 File tempFile = new File("myTempFile.txt");

		 try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String currentLine;
			while((currentLine = reader.readLine()) != null) {
				if(currentLine.contains(oyuncu.getIsim()))
				{
					 //String kullaniciBilgileri = "\n"+ad + " easy(0)";
					 String kullaniciBilgileri =oyuncu.getIsim() + " "+oyuncu.getZorluk() +"("+oyuncu.getLevel()+")";
					 //writer.write(kullaniciBilgileri + System.getProperty("line.separator"));
					 writer.write(kullaniciBilgileri);
					 writer.newLine();
					 
				}else{
					writer.write(currentLine);
					writer.newLine();
					
				}
			}
			writer.close(); 
			reader.close();
			inputFile.delete();
			tempFile.renameTo(inputFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

		 
		 
	 }


}
