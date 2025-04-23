package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class Media {
	public int id;
	public String title;
	public String category;
	public float cost;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost(); 
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public void Print () {}
	public boolean isMatchID (Object id) {
		return false;
	}
	
	public float getCost() {
		return this.cost;
	}
	public String getTitle () {
		return this.title;
	}
	public boolean equals (Media media) {
		if (this == media) return true;
		if (media == null || this.getClass() != media.getClass()) return false;
		
		return this.title != null && this.title.equals(media.title);
	}
	
	public void play() {
		
	}
}
