public class Puaca extends FirinProduct {
	
	private int cost;
	
	

	public Puaca(String name, int cost) {
		super(name);
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + getCost() + "\n";
	}
	

}