import java.util.Scanner;

class Sum1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = s.nextInt();

        if(size <= 0)
        {
            System.out.println("Please enter a positive size");
            return;
        }

        System.out.println("Enter the array elements:");
        int[] number = new int[size];

        for(int i = 0; i < size; i++)
        {
            number[i] = s.nextInt();
        }

        int sum = 0;   // declare sum variable

        for(int i = 0; i < size; i++)
        {
            sum += number[i];   // add elements
        }

        System.out.println("Sum of Array elements: " + sum);
    }
}