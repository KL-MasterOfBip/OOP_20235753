package hust.soict.hedspi.aims.media;

//import java.util.List;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("Abc", "Anime", 2.12f);
		book1.addAuthor("Khánh");
		book1.addAuthor("Khương");
		book1.Print();
		book1.removeAuthor("Khương");
		book1.removeAuthor("Zũ");
		book1.Print();
	}

}
