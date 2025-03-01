import java.util.Scanner;

public class CalculatorBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phep tinh dang axb, trong do x la phep toan +, -, *, /, a, b la cac so thuc duoc nhap khong cach:");
        String input = scanner.nextLine(); // Nhập cả dòng

        int a = 0;
        boolean check = true;
        for (int i = 0;i < input.length();i ++)
        {
            char tmp = input.charAt(i);
            if (tmp >= '0' && tmp <= '9')
                continue;
            else
                if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/')
                    a = i;
                else
                    if (tmp == '.')
                        continue;
                    else
                    {
                        System.out.println("Nhap khong hop le!");
                        check = false;
                        break;
                    }
        }

        if (check)
        {
            String s1 = input.substring(0, a);
            double num1 = Double.parseDouble(s1);
            String s2 = input.substring(a + 1);
            double num2 = Double.parseDouble(s2);
            //System.out.println(num1);
            //System.out.println(num2);

            char tmp = input.charAt(a);
            if (tmp == '+')
            {
                System.out.println("Ket qua phep tinh la:");
                System.out.println(num1 + num2);
            }
            else
                if (tmp == '-')
                {
                    System.out.println("Ket qua phep tinh la:");
                    System.out.println(num1 - num2);
                }
                else
                    if (tmp == '*')
                    {
                        System.out.println(num1 * num2);
                        System.out.println("Ket qua phep tinh la:");
                    }
                    else
                        if (num2 != 0)
                        {
                            System.out.println(num1 / num2);
                            System.out.println("Ket qua phep tinh la:");
                        }
                        else
                            System.out.println("Khong the thuc hien phep tinh do so chia bang 0");
        }


        scanner.close();
    }
}




/*import java.until.Scanner;

public class cal{
    public static void main(String[] a){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap xau di: ");
        String input = nhap.nextline();
        System.out.println("Ket qua xau: " + input);
        nhap.close;
    }
}*/