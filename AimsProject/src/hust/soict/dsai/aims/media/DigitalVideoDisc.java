package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
//	private String title;
//	private String category;
//	private String director;
//	private int length;
//	private float cost;
//	
//	public int id;
	private static int nbDigitalVideoDiscs = 0;
//	
//	public String getTitle() {
//		return title;
//	}
//	
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public String getDirector() {
//		return director;
//	}
//
//	public int getLength() {
//		return length;
//	}
//
//	public float getCost() {
//		return cost;
//	}
//
//	public DigitalVideoDisc(String title) {
//		super();
//		this.title = title;
//		nbDigitalVideoDiscs++;
//	    this.id = nbDigitalVideoDiscs;		
//	}
//	
//	public DigitalVideoDisc(String title, String category, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.cost = cost;
//		nbDigitalVideoDiscs++;
//	    this.id = nbDigitalVideoDiscs;		
//	}
//	
//	public DigitalVideoDisc(String title, String category, String director, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.cost = cost;
//		nbDigitalVideoDiscs++;
//	    this.id = nbDigitalVideoDiscs;		
//	}
//		
//	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.director = director;
//		this.length = length;
//		this.cost = cost;
//		nbDigitalVideoDiscs++;
//	    this.id = nbDigitalVideoDiscs;		
//	}
//	
//	public String toString() {
//        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + '$';
//    }
//	
//	public int getID() {
//        return id;
//    }
//	
//	public boolean isMatch(String title) {
//        return this.title.equalsIgnoreCase(title);
//    }	
//}
//	public DigitalVideoDisc(String title) {
//		super(title);
//		setTitle(title);
//		nbDigitalVideoDiscs++;
//	    setId(nbDigitalVideoDiscs);
//	}
//	
//	public DigitalVideoDisc(String title, String category, float cost) {
//		super(title, category, cost);
//		setTitle(title);
//		setCategory(category);
//		setCost(cost);
//		nbDigitalVideoDiscs++;
//	    setId(nbDigitalVideoDiscs);
//	}
//	
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super(title, category, cost);
//		setTitle(title);
//		setCategory(category);
//		this.director = director;
//		setCost(cost);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(title, category, cost, length, director);
//		setTitle(title);
//		setCategory(category);
//		this.director = director;
//		this.length = length;
//		setCost(cost);
		nbDigitalVideoDiscs++;
	    setId(nbDigitalVideoDiscs);
	}
	
	@Override
	public String toString() {
        return "DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost();
    }
	
	public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }
	
	public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength());
    }
}