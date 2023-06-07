package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered ==  MAX_NUMBERS_ORDERED) {
			System.out.println("the cart is alsmost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}
	
	//different type of parameter
//	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
//        for (DigitalVideoDisc disc : dvdList) {
//            addDigitalVideoDisc(disc);
//        }
//    }
	
	//pass an arbitrary number of arguments 
//	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//		for (DigitalVideoDisc disc : dvdList) {
//			addDigitalVideoDisc(disc);
//		}
//	}

	// add two dvds into cart
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
				
	}
		
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i<qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				itemsOrdered[i] = itemsOrdered[qtyOrdered-1];
				qtyOrdered--;
			}
		}
		
	}
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i<qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
			
	}
	
	public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() );
        System.out.println("***************************************************");
    }
	public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getID() == id) {
                System.out.println("Search results by ID " + id + ":");
                System.out.println(itemsOrdered[i].toString());
                found = true;
                
            }
        }
        if (!found) {
            System.out.println("No match is found by ID " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results by title: " + title);
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match is found by title: " + title);
        }
    }
}
		

