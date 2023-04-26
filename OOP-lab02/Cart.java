package ooplab02;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered==MAX_NUMBERS_ORDERED) {
			System.out.println("the cart is alsmost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}
		
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0;i<qtyOrdered;i++) {
			if (itemsOrdered[i]==disc) {
				itemsOrdered[i]=itemsOrdered[qtyOrdered-1];
				qtyOrdered--;
			}
		}
		
	}
	
	public float totalCost() {
		float sum=0;
		for (int i=0;i<qtyOrdered;i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
			
	}
		
}
