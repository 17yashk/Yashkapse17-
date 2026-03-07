import java.util.Scanner;
class Import
{
public static void main(String[] args)
{
System.out.println("Get input from the user:");
Scanner s = new Scanner(System.in);
System.out.println("Enter the first number ");
int a = s.nextInt();
System.out.println("Enter the Second number ");
int b = s.nextInt();
int sum=a+b;
System.out.println("Sum of the Two number:");
System.out.println(sum);
}
}
