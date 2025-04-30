package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private float length;
	public float getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
	// Phương thức khởi tạo Track
	public Track () {}
	
	public Track (String title, float length) {
		super();
		this.title = title;
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length" + this.getLength());
	}
	
	public boolean equals (Track track) {
		if (this == track) return true;
		if (track == null || this.getClass() != track.getClass()) return false;
		
		return this.title != null && this.length != 0 && this.title.equals(track.title) && this.title.equals(track.title);
	}
}
