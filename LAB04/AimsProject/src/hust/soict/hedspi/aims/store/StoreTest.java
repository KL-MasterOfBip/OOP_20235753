package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); 
		Book book1 = new Book("Enen no Shobotai", "Anime", 12.2f);
		Store Khanh = new Store();
		Khanh.addMedia(dvd1);
		Khanh.addMedia(dvd2);
		Khanh.addMedia(dvd3);
		Khanh.addMedia(book1);
		Khanh.Print();
	}

}
