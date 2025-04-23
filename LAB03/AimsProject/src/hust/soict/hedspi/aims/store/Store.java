package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	// Thêm sản phẩm vào cửa hàng
	public void addMedia(Media media) {
		boolean check = true;
		for (Media tmp : this.itemsInStore) {
			if (tmp == media) {
				check = false;
				System.out.println("Sản phẩm '" + media.title + "' đã có trong cửa hàng!");
				break;
			}
		}
		if (check) {
			this.itemsInStore.add(media);
			System.out.println("Thêm sản phẩm thành công!");
		}
	}
	
	// Xóa sản phẩm khỏi cửa hàng
		public void removeMedia(Media media) {
			boolean check = true;
			for (int i = 0;i < this.itemsInStore.size();i ++) {
				if (this.itemsInStore.get(i) == media) {
					this.itemsInStore.remove(media);
					System.out.println("Sản phẩm '" + media.title + "' đã bị xóa trong giỏ hàng!");
					break;
				}
			}
			if (check) {
				System.out.println("Sản phẩm '" + media.title + "' không có trong giỏ hàng");
			}
		}
		
	// Hiển thị các sản phẩm có trong cửa hàng
		public void Print() {
			System.out.println("Cửa hàng có những sản phẩm là:");
			for (Media tmp : this.itemsInStore) {
				tmp.Print();
			}
		}
	
}
