public class TestSales {

	public static void main(String[] args) {
		
		Sales s = new Sales();
		
		s.addSoldItem(new Ekmek("Kepekli", 20, 0.1));
		s.addSoldItem(new KuruPasta("Ekler", 1, 4));
		s.addSoldItem(new Puaca("SadePuaca", 2));
		s.addSoldItem(new ZeytinliPuaca("ZeytinlimFavorim", 2, 1));
		
		System.out.println("number of items : " + s.getNumberOfItems());
		System.out.println("total cost : " + s.getTotalCost());
		
		System.out.println(s);
		
		s.clearSoldItem();
		
		

	}

}