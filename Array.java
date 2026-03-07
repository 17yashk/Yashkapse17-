import java.util.Scanner;
class Array
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the size :");
int size = s.nextInt();
if(size<=0)
{
System.out.println("Array size must be a positive integer");
return;
}
int[] numbers = new int[size];
System.out.println("Enter the elements:");
for(int i=0;i<size;i++)
{
numbers[i] = s.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<size;i++)
{

System.out.println(numbers[i]);
}
}
}

