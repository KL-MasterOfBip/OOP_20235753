import java.util.Scanner;

public class Matrix {
	public static void main (String[] args) {
		System.out.println("Nhap co cua ma tran:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		double[][] a1 = new double[n][m];
		double[][] a2 = new double[n][m];
		System.out.println("Nhap ma tran thu nhat, nhap tung day gia tri theo hang truoc:");
		for (int i = 0;i < n;i ++)
			for (int j = 0;j < m;j ++)
				a1[i][j] = input.nextInt();
		System.out.println("Nhap ma tran thu hai, theo cach nhap tuong tu:");
		for (int i = 0;i < n;i ++)
			for (int j = 0;j < m;j ++)
				a2[i][j] = input.nextInt();
		
		System.out.println("Ket qua cong cua 2 ma tran la:");
		for (int i = 0;i < n;i ++)
		{
			for (int j = 0;j < m;j ++)
				System.out.print((a1[i][j] + a2[i][j]) + " ");
			System.out.println("");
		}
		
	}
}
