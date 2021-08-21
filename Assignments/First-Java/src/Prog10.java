import java.util.Scanner;
public class Prog10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = 0; 
        int l = 0;

        System.out.print("Enter a series of values (0 to quit): ");

        while ((input = sc.nextInt()) != 0) 
        {
            l = Integer.max(l, input);
        }

    System.out.println("The largest integer is: " + l);
    }
}
