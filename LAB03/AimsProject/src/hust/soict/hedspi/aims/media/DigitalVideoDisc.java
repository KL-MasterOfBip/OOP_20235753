package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
	private static int nbDigitalVideoDiscs = 0;
	private String director;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	
	public int getID () {
		return this.id;
	}
	
	public void Delete() {
		this.title = "";
		this.category = "";
		this.director = "";
		this.length = 0;
		this.cost = 0;
	}
	
	//Lab 03 Update
	
	// Định dạng in DVD ra
	public String toString () {
		String tmp = "DVD";
		if (this.title != null)
			tmp = tmp + " - " + this.title;
		if (this.category != null)
			tmp = tmp + " - " + this.category;
		if (this.director != null)
			tmp = tmp + " - " + this.director;
		//if (this.length != 0)
			tmp = tmp + " - " + this.length;
		tmp = tmp + ": " + this.cost + " $";
		return tmp;
	}
	
	// In DVD
	public void Print() {
		System.out.println(this.toString());
	}
	
	// Kiểm tra khớp với ID đã cho hay không
	public boolean isMatch(int id) {
		if (this.id == id)
			return true;
		else
			return false;
	}
	
	// Kiểm tra khớp với Title đã cho hay không
	public boolean isMatch(String title) {
		if (this.title == title)
			return true;
		else
			return false;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}	
		
}
