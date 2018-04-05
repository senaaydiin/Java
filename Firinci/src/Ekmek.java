public class Ekmek extends FirinProduct{
	
	private int numberOfDilim;
	private double pricePerDilim;
	
	
	
	
	
	public Ekmek(String name, int numberOfDilim, double pricePerDilim) {
		super(name);
		this.numberOfDilim = numberOfDilim;
		this.pricePerDilim = pricePerDilim;
	}
	
	public int getCost() {
		
		return (int) (getNumberOfDilim()*getPricePerDilim());
	}
	
	@Override
	public String toString() {
		return super.toString() + getCost() + "\n";
	}
	
	
	public int getNumberOfDilim() {
		return numberOfDilim;
	}
	public void setNumberOfDilim(int numberOfDilim) {
		this.numberOfDilim = numberOfDilim;
	}
	public double getPricePerDilim() {
		return pricePerDilim;
	}
	public void setPricePerDilim(double pricePerDilim) {
		this.pricePerDilim = pricePerDilim;
	}
	
	
	

}