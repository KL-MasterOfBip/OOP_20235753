package Aims;

import java.util.Scanner;
public class Aims {
	public static void main(String[] args) { 
		Aims.showMenu();

	}
	public static int choose () {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		int choose = Aims.choose();
		if (choose == 1) {
			Aims.storeMenu();
		}
		else
			if (choose == 2) {
				
			}
			else
				if (choose == 3) {
					Aims.cartMenu(1);
				}
				else 
					System.out.println("Bạn đã thoát ra Aims. Cảm ơn đã sử dụng :3! Tít tít tít!");
	}
	
	// Aims options
		public static void storeMenu() {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media’s details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			int choose = Aims.choose();
			
			if (choose == 1) {
				Aims.mediaDetailsMenu();
			}
			else
				if (choose == 2) {
					
				}
				else
					if (choose == 3) {
						
					}
					else
						if (choose == 4) {
							Aims.cartMenu(2);
						}
						else
							Aims.showMenu();
		}
		// Store Menu options
			public static void mediaDetailsMenu() {
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. Add to cart");
				System.out.println("2. Play");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2");
				int choose = Aims.choose();
				if (choose == 1) {
							
				}
				else
					if (choose == 2) {
						
					}
					else
						if (choose == 3) {
							
						}
						else
							if (choose == 4) {
								
							}
							else
								Aims.storeMenu();
			
			} 
			public static void cartMenu(int where) {
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. Filter media in cart");
				System.out.println("2. Sort media in cart");
				System.out.println("3. Remove media from cart");
				System.out.println("4. Play a media");
				System.out.println("5. Place order");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2-3-4-5");
				int choose = Aims.choose();
				if (choose == 1) {
							
				}
				else
					if (choose == 2) {
						
					}
					else
						if (choose == 3) {
							
						}
						else
							if (choose == 4) {
								
							}
							else
							{
								if (where == 2)
									Aims.storeMenu();
								if (where == 1)
									Aims.showMenu();
							}
			}
}
