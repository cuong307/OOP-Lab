package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc; 

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is already full.");
  
        }
        
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
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
//	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
//		addDigitalVideoDisc(dvd1);
//		addDigitalVideoDisc(dvd2);
//				
//	}
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                itemsOrdered[qtyOrdered] = null;
                System.out.println("The disc has been removed.");
                
            }
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
	public void printCart() {
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