import java.util.Scanner;
class Input
{
public static void main(String args[])
    {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The sum is: "+c);
    }
}
