package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main (String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
		cart.addMedia(dvd1); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
		cart.addMedia(dvd2); 
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); 
		cart.addMedia(dvd3); 
		
		// Kiểm tra về mặt hiển thị
		cart.Print();
		
		// Kiểm tra về mặt tra cứu
		cart.SearchID(9);
		
		cart.SearchTitle("HuhuHjhj");
	}
}
