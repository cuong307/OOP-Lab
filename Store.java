package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
    private int count;

    public Store(int maxcapacity) {
        itemsInStore = new DigitalVideoDisc[maxcapacity];
        count = 0;
    } 

    public void addDVD(DigitalVideoDisc dvd) {
        if (count < itemsInStore.length) {
            itemsInStore[count] = dvd;
            count++;
            System.out.println("DVD" + count + " has been added to the store.");
        } else {
            System.out.println("The store is already full.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i].equals(dvd)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[count - 1] = null;
            count--;
            System.out.println("DVD" + count + " has been removed from the store.");
        } else {
            System.out.println("DVD is not found in the store.");
        }
    }
    
    public float totalCost() {
		float sum = 0;
		for (int i = 0; i < count;i++) {
			sum += itemsInStore[i].getCost();
		}
		return sum;
			
	}
    public void displayDVDs() {
        if (count == 0) {
            System.out.println("The store is empty. No DVDs available.");
        } else {
            System.out.println("DVDs in the store:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i]);
            }
        }
        System.out.println("Total cost: " + totalCost() );
    }
}
