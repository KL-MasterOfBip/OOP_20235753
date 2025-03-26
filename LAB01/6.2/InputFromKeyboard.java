import java.util.Scanner;

public class InputFromKeyboard{ 
	public static void main(String args[]){ 
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Ten ban la gi?");
		String strName = keyboard.nextLine();
		System.out.println("So thich cua ban la gi?");
		String strHb = keyboard.nextLine();
		System.out.println("Ban ten la " + strName + ". " + "So thich cua ban la " + strHb);
	}
}