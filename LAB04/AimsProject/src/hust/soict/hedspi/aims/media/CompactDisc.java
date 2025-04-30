package hust.soict.hedspi.aims.media;

import java.util.List;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private float length = 0;
	
	public String getArtist () {
		return this.artist;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public CompactDisc () {
		
	}
	public void addTrack (Track track) {
		boolean check = true;
		for (Track tmp : tracks) {
			if (tmp == track) {
				check = false;
				System.out.println("Track '" + track.getTitle() + "' đã có sẵn trong CD này rồi!");
				break;
			}
		}
		if (check) {
			tracks.add(track);
			length += track.getLength();
		}
	}
	
	public void removeTrack (Track track) {
		boolean check = true;
		for (int i = 0;i < tracks.size();i ++) {
			if (tracks.get(i) == track) {
				tracks.remove(track);
				check = false;
				length -= track.getLength();
				break;
			}
		}
		if (check) {
			System.out.println("Không có Track " + track + " trong CD này!");
		}
		
	}
	
	public void play() {
		for (Track tmp : tracks) {
			tmp.play();
		}
	}
	
	public String toString () {
		String tmp = "CD";
		if (this.title != null)
			tmp = tmp + " - " + this.title;
		if (this.category != null)
			tmp = tmp + " - " + this.category;
		//if (this.length != 0)
			tmp = tmp + " - " + this.length;
		tmp = tmp + ": " + this.cost + " $";
		return tmp;
	}
	
	public void Print() {
		System.out.println(this.toString());
	}
}
