public class KuruPasta extends FirinProduct{

	private int number;
	private double pricePerPasta;
	
	
	
	public KuruPasta(String name, int number, double pricePerPasta) {
		super(name);
		this.number = number;
		this.pricePerPasta = pricePerPasta;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPricePerPasta() {
		return pricePerPasta;
	}
	public void setPricePerPasta(double pricePerPasta) {
		this.pricePerPasta = pricePerPasta;
	}
	
	
	@Override
	public int getCost() {
		
		return (int) (getNumber()*getPricePerPasta());
	}
	
	@Override
	public String toString() {
		return super.toString() + getCost() + "\n";
	}
	
	
}