import java.util.Scanner;
public class sum_input
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");     
        int x=sc.nextInt();
        System.out.println("Enter a number");
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum is "+sum);

        System.out.println("You entered "+x);
        
    }


}

