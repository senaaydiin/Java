public class ZeytinliPuaca extends Puaca{
	
	private int costOfZeytin;
	
	

	public ZeytinliPuaca(String name, int cost, int costOfZeytin) {
		super(name, cost);
		this.costOfZeytin = costOfZeytin;
	}
	
	@Override
	public int getCost() {
		
		return super.getCost() + getCostOfZeytin();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n";
	}

	public int getCostOfZeytin() {
		return costOfZeytin;
	}

	public void setCostOfZeytin(int costOfZeytin) {
		this.costOfZeytin = costOfZeytin;
	}
	
	

}