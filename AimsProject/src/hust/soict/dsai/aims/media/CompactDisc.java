package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable {
	private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(title, category, cost, length, director);
        this.artist = artist;
        tracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the Compact Disc.");
        } else {
            tracks.add(track);
            System.out.println("Track added to the Compact Disc.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed from the Compact Disc.");
        } else {
            System.out.println("Track is not found in the Compact Disc.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public void play() throws PlayerException {
    	if(this.getLength() > 0) {
    		System.out.println("Playing compact disc: " + getTitle() + "Artist: " + artist);
    		System.out.println("Total Length: " + getLength());

    		System.out.println("Tracks:");
    		for (Track track : tracks) {
    			track.play();
    		}
    		java.util.Iterator iter = tracks.iterator();
    		Track nextTrack;
    		while(iter.hasNext()) {
    			nextTrack = (Track) iter.next();
    			try {
    				nextTrack.play();
    			}catch(PlayerException e) {
    				throw e;
    			}
    		}
    	}else {
    		throw new PlayerException("ERROR: CD length is non-positive!");
    	}
    }
    
    @Override
    public String toString() {
    	return "CompactDisc - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getArtist() + " - " + getLength() + ": " + getCost();
    }
}