package Aims;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; //qtyOrdered
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < 20)
		{
			itemsOrdered[qtyOrdered] = disc;
			System.out.println("Đĩa đã được thêm vào!");
			qtyOrdered ++;
		}
		else
			System.out.println("Giỏ hàng đã đầy rồi!");
	}	
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		int j = 0;
		if (qtyOrdered == 0)
			System.out.println("Giỏ hàng đã đầy rồi!");
		else {
			int conlai = 20 - qtyOrdered;
			for (int i = 1; qtyOrdered + i <= 20;i ++)
			{
				if (j == dvdList.length - 1)
					break;
				itemsOrdered[qtyOrdered + i] = dvdList[j];
				System.out.println("Đĩa đã được thêm vào!");
				j ++;
			}
			if (j > conlai)
				System.out.println("Chi them duoc " + (j - conlai) + " DVD");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		String title = disc.getTitle();
		for (int i = 0;i < qtyOrdered;i ++) {
			if (disc.getID() == itemsOrdered[i].getID()) {
				if (i == qtyOrdered - 1)
					itemsOrdered[i].Delete();
				else
					itemsOrdered[i] = itemsOrdered[i + 1];
				System.out.println("Xoa thanh cong DVD: " + title);
				qtyOrdered --;
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered < 20)
		{
			itemsOrdered[qtyOrdered] = dvd1;
			System.out.println("Đĩa đã được thêm vào!");
			qtyOrdered ++;
			if (qtyOrdered == 19) {
				itemsOrdered[qtyOrdered] = dvd1;
				System.out.println("Đĩa đã được thêm vào!");
				qtyOrdered ++;
			}		
		}
		else
			System.out.println("Giỏ hàng đã đầy rồi!");
	}
	public void Display() {
		for (int i = 0;i < qtyOrdered;i ++)
			System.out.println(itemsOrdered[i].getTitle());
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0;i < qtyOrdered;i ++)
			total += itemsOrdered[i].getCost();
		return total;
	}
}
