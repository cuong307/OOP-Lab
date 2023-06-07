package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store(4); // Create a store with a max capacity of 5 DVD
		
        // Create DVD 
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avangers Endgame", "Science Fiction", 28.99f);
        

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        
        // Display DVDs
        store.displayDVDs();
        System.out.println("");
        
        // Remove a DVD 
        store.removeDVD(dvd3);
        
        // Display after removing
        store.displayDVDs();
        System.out.println("");
        
    }
}
