import java.util.Scanner;

public class SolveFunction{
    public static void main (String[] args){
        System.out.println("1: Giai phuong trinh bac nhat 1 an: ax + b = 0");
        System.out.println("2: Giai he phuong trinh bac nhat 2 an: a1x + b1x = c1, a2x + b2x = c2");
        System.out.println("3: Giai phuong trinh bac hai 1 an: ax^2 + bx + c = 0");
        System.out.print("Hay chon kieu phuong trinh de giai: ");
        java.util.Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("");
        if (x == 1) // Giai phuong trinh bac nhat
        {
            System.out.println("Ban chon giai phuong trinh bac nhat 1 an: ax + b = 0");
            System.out.println("Hay nhap he so a, b (Enter sau moi lan nhap):");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
            {
                if (a == 0)
                    System.out.println("Phuong trinh vo so nghiem");
                else
                    System.out.println("Phuong trinh co nghiem la: 0");
            }
            else
                if (a == 0)
                    System.out.println("Phuong trinh vo nghiem");
                else
                    System.out.println("Phuong trinh co nghiem la: " + (b/a * -1));
        }
        else
            if (x == 2) // Giai phuong trinh bac hai
            {
                System.out.println("Ban chon giai he phuong trinh bac nhat 2 an: a1x + b1x = c1, a2x + b2x = c2");
                System.out.println("Hay nhap he so a1, b1, c1:");
                double a1 = scanner.nextDouble();
                double b1 = scanner.nextDouble();
                double c1 = scanner.nextDouble();

                System.out.println("Hay nhap he so a2, b2, c2");
                double a2 = scanner.nextDouble();
                double b2 = scanner.nextDouble();
                double c2 = scanner.nextDouble();

                double tmp = b1*a2 - b2*a1;
                double tmp1 = c1*a2 - c2*a1;
                if (tmp == 0)
                {
                    if (tmp1 == 0)
                        System.out.println("He phuong trinh vo so nghiem");
                    else
                        System.out.println("He phuong trinh vo nghiem");
                }
                else
                {
                    double x2 = tmp1 / tmp;
                    double x1 = (c1 - x2 * b1) / a1;
                    System.out.println("He phuong trinh co nghiem la:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }

            }
            else
                if (x == 3) // Giai phuong trinh bac 2 mot an
                {
                    System.out.println("Ban chon giai phuong trinh bac hai 1 an: ax^2 + bx + c = 0");
                    System.out.println("Nhap a, b, c:");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();

                    double den = b*b - 4 * a * c;
                    if (den < 0)
                        System.out.println("Phuong trinh vo nghiem");
                    else
                    {
                        System.out.println("Phuong trinh co nghiem la:");
                        System.out.println("x1 = " + (((-1 * b) + Math.sqrt(den) )/ (2 * a)));
                        System.out.println("x2 = " + (((-1 * b) - Math.sqrt(den) )/ (2 * a)));
                    }
                }
    }
}
