import java.util.Scanner;

public class Sort {
	public static void main (String[] args) {
		System.out.println("Hay nhap so phan tu mang:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] a = new double[n];
		double sum = 0;
		for (int i = 0;i < n;i ++) {
			System.out.print("Phan tu thu " + i+1 + ":");
			a[i] = input.nextDouble();
			sum = sum + a[i];
		}
		double avg = sum/n;
		
		for (int i = 0;i < n - 1;i ++)
			for (int j = i + 1;j < n;j ++)
				if (a[i] > a[j])
				{
					double tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
		System.out.println("Tong cua day la: " + sum);
		System.out.println("Gia tri trung binh cua day la: " + avg);
		System.out.println("Day sau khi sap xep:");
		for (int i = 0;i < n;i ++) {
			System.out.print(a[i] + " ");
		}
	}
}
