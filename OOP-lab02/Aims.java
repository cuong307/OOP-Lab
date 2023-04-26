package ooplab02;

public class Aims {

	public static void main(String[] args) {
		// Create new cart
		Cart anOrder = new Cart();
		
		//create new dvd objects and add them tot he cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("the lion king","animation","Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("stars war","science ficrion","George lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("aladin","animation","Roger Allers",87, 18.95f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.removeDigitalVideoDisc(dvd3);
		
		//print total cost of the items int he cart
		System.out.println("total cost:" + anOrder.totalCost());
		
	}

}
