
public class Oyuncu {
	private String isim;
	private String zorluk;
	private int level;
	public  String [][] grid;
	public Oyuncu() {
		
	}
	public Oyuncu(String isim) {
		super();
		this.isim = isim;
	}
	
	 public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getZorluk() {
		return zorluk;
	}
	public void setZorluk(String zorluk) {
		this.zorluk = zorluk;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
