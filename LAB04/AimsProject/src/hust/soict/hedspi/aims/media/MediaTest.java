package hust.soict.hedspi.aims.media;

public class MediaTest {

	public static void main(String[] args) {
		CompactDisc CD1 = new CompactDisc();
		Track track1 = new Track("Nơi này có anh", 2.5f);
		Track track2 = new Track("Nơi này có anh 2", 2.5f);
		Track track3 = new Track("Chắc ai đó sẽ về", 2.5f);
		CD1.addTrack(track1);
		CD1.addTrack(track2);
		CD1.addTrack(track1);
		CD1.addTrack(track3);
		CD1.removeTrack(track2);
		System.out.println(CD1.getLength());
	}

}
