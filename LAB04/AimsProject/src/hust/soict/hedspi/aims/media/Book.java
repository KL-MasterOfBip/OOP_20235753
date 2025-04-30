package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private static int numofBook = 0;
	private List<String> authors = new ArrayList<String>(); 
	
	// Các phương thức khởi tạo Book
	public Book(String title, String category, float cost, List<String> authors) {
		super();
		this.id = numofBook;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
		numofBook ++;
	}
	
	
	public Book(String title, String category, float cost) {
		super();
		this.id = numofBook;
		this.title = title;
		this.category = category;
		this.cost = cost;
		numofBook ++;
	}

	
	public Book(String title, String category) {
		super();
		this.id = numofBook;
		this.title = title;
		this.category = category;
		numofBook ++;
	}
	
	public Book() {
		numofBook ++;
	}
	// Các hàm getter và setter
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public List<String> getAuthors() {
		return authors;
	}
	// Thêm Author
	public void addAuthor(String authorName) {
		boolean check = true;
		for (String tmp : authors) {
			if (tmp == authorName) {
				System.out.println("Tác giả đã có trong cuốn sách này rồi!");
				check = false;
				break;
			}
		}
		if (check) {
			authors.add(authors.size(), authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		boolean check = true;
		for (int i = 0;i < authors.size();i ++) {
			if (authors.get(i) == authorName) {
				authors.remove(authorName);
				check = false;
			}
		}
		if (check) {
			System.out.println("Không có tác giả " + authorName + " trong cuốn sách này");
		}
	}
	
	public String toString () {
		String tmp = "Book";
		if (this.title != null)
			tmp = tmp + " - " + this.title;
		if (this.category != null)
			tmp = tmp + " - " + this.category;
		tmp = tmp + ": " + this.cost + " $";
		return tmp;
	}
	
	public void Print() {
		System.out.print(this.toString());
		for (String tmp : authors) {
			System.out.print(" - " + tmp);
		}
		System.out.println(": " + this.cost + "$");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
