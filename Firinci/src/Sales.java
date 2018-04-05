import java.util.ArrayList;
import java.util.List;



public class Sales {

	List<FirinProduct> soldItems = new ArrayList<>(); 
	
	public void addSoldItem(FirinProduct product) {
		soldItems.add(product);
		
	}
	
	public void clearSoldItem() {
		
		soldItems.clear();
	}
	
	public int getNumberOfItems() {
		
		return soldItems.size();
	}
	
	public int getTotalCost() {
		
		int cost=0;
		
		for(int i=0; i<soldItems.size(); i++) {
			cost += soldItems.get(i).getCost();
		}
		return cost;
		
	}
	
	public String toString() {
		String info = "";
		for(int i=0; i<soldItems.size(); i++) {
			info += soldItems.get(i).toString();
		}
		return info;
	}
	
	
}