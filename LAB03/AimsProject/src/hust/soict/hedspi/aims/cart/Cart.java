package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; //qtyOrdered
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	//LAB03 Updates
	
	// Thêm sản phẩm vào giỏ hàng
	public void addMedia(Media media) {
		boolean check = true;
		for (Media tmp : this.itemsOrdered) {
			if (tmp == media) {
				check = false;
				System.out.println("Sản phẩm '" + media.title + "' đã có trong giỏ hàng!");
				break;
			}
		}
		if (check) {
			this.itemsOrdered.add(media);
		}
	}
	
	// Xóa sản phẩm khỏi giỏ hàng
	public void removeMedia(Media media) {
		boolean check = true;
		for (int i = 0;i < this.itemsOrdered.size();i ++) {
			if (this.itemsOrdered.get(i) == media) {
				this.itemsOrdered.remove(media);
				System.out.println("Sản phẩm '" + media.title + "' đã bị xóa trong giỏ hàng!");
				break;
			}
		}
		if (check) {
			System.out.println("Sản phẩm '" + media.title + "' không có trong giỏ hàng");
		}
	}
	
	//Hiển thị các sản phẩm có trong giỏ hàng
	public void Display() {
		System.out.println("Giỏ hàng có những sản phẩm là:");
		for (Media tmp : this.itemsOrdered) {
			tmp.Print();
		}
	}
	
	// Tính tổng tiền
	public float totalCost() {
		float total = 0;
		for (Media tmp : this.itemsOrdered) {
			total += tmp.cost;
		}
		return total;
	}
	
	//In ra giỏ hàng và tính tổng tiền cần thanh toán
	public void Print () {
		if (this.itemsOrdered.size() == 0) {
			System.out.println("This cart is empty!");
		}
		else {
			System.out.println("Ordered Items:");
			for (Media tmp : this.itemsOrdered) {
				tmp.Print();
			}
			System.out.println("Total cost: " + this.totalCost());
		}
	}
	
	// Tìm kiếm 
	
	// Tìm kiếm theo ID
	public void SearchID (int id) {
		boolean check = true;
		for (Media tmp : this.itemsOrdered) {
			if (tmp.isMatchID(id)) {
				tmp.Print();
				check = false;
			}
		}
		if (check) {
			System.out.println("Không tìm thấy sản phẩm nào có ID là " + id);
		}
	}
	// Tìm kiếm theo Title
	public void SearchTitle (String title) {
		boolean check = true;
		for (Media tmp : this.itemsOrdered) {
			if (tmp.isMatchID(title)) {
				tmp.Print();
				check = false;
			}
		}
		if (check) {
			System.out.println("Không tìm thấy sản phẩm nào có tiêu đề là " + title);
		}
	}
}
