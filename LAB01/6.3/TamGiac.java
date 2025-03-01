import java.util.Scanner;

public class TamGiac {
	public static void main (String[] args) {
		System.out.print("n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = (n - 1)*2 + 1;
		for (int i = 0;i < n;i ++)
		{
			for (int j = n - 2;j >= 0;j --)
				if (j <= i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("*");
			for (int j = 0;j < n - 1;j ++)
				if (j <= i - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");		
		}
				
	}
}
