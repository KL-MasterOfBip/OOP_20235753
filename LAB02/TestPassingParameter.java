<<<<<<< HEAD
package Aims;

public class TestPassingParameter { 
		public static void main (String[] args) { 
			DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle"); 
			DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella"); 
			swap(jungleDVD, cinderellaDVD); 
			
			System.out.println("jungle dvd title: " + jungleDVD.getTitle());
					
			System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
					
			changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
					
			System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
			
		}
		
		public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2) { 
				DigitalVideoDisc tmp = o1; 
				o1 = o2; 
				o2 = tmp; 
		} 
		public static void changeTitle (DigitalVideoDisc dvd, String title) { 
				String oldTitle = dvd.getTitle(); 
				dvd.setTitle(title); 
				dvd = new DigitalVideoDisc(oldTitle);
		}
		

}
=======
package Aims;

public class TestPassingParameter { 
		public static void main (String[] args) { 
			DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle"); 
			DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella"); 
			swap(jungleDVD, cinderellaDVD); 
			
			System.out.println("jungle dvd title: " + jungleDVD.getTitle());
					
			System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
					
			changeTitle(jungleDVD, cinderellaDVD.getTitle()); 
					
			System.out.println("jungle dvd title: " + jungleDVD.getTitle()); 
			
		}
		
		public static void swap (DigitalVideoDisc o1, DigitalVideoDisc o2) { 
				DigitalVideoDisc tmp = o1; 
				o1 = o2; 
				o2 = tmp; 
		} 
		public static void changeTitle (DigitalVideoDisc dvd, String title) { 
				String oldTitle = dvd.getTitle(); 
				dvd.setTitle(title); 
				dvd = new DigitalVideoDisc(oldTitle);
		}
		

}
>>>>>>> 3814c6577c8405e09325a02b4f195b31f28fcce1
