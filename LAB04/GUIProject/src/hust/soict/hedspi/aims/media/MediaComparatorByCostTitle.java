package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>  {
	public int compare (Media m1, Media m2) {
		int check = Float.compare(m1.getCost(), m2.getCost());
		if (check != 0)
			return check;
		
		return m1.getTitle().compareToIgnoreCase(m2.getTitle());
	}
}
