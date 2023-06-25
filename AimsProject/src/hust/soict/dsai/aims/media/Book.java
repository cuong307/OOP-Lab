package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
//	public Book(String title) {
//        super(title);
//    }
//
    public Book(String title, String category,String authors, float cost) {
        super(title, category, cost);
    }
    
    public Book(int id,String title, String category, float cost) {
        super(id, title, category, cost);
    }

	public List<String> getAuthors() {
		return authors;
	}

	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author " + authorName + " has been added to the book.");
        } else {
            System.out.println("Author " + authorName + " already exists in the book.");
        }
    }
    
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author " + authorName + " has been removed from the book.");
        } else {
            System.out.println("Author " + authorName + " is not found in the book.");
        }
    }
    
    @Override
    public String toString() {
        return "Book - " + getTitle() + " - " + getId() + " - " + getAuthors() + " - " + getCategory() + ": " + getCost();
    }
}
