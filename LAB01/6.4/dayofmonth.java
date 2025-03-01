import java.util.Scanner;

public class dayofmonth {
	public static void main (String[] args) {
		System.out.println("Nhap thang va nam cach nhau bang dau cach:");
		Scanner keyboard = new Scanner(System.in);
		int month = keyboard.nextInt();
		int year = keyboard.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.println("Thang " + month + " nam " + year + " co 31 ngay");
		else
			if (month == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					System.out.println("Thang " + month + " nam " + year + " co 29 ngay");
				else
					System.out.println("Thang " + month + " nam " + year + " co 28 ngay");
			}
			else
				System.out.println("Thang " + month + " nam " + year + " co 30 ngay");
		}
}
