import java.util.Scanner;

public class calc 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter maths");     
        int m=sc.nextInt();
        System.out.println("Enter a english");
        int e=sc.nextInt();
        int sum=m+e;
        float percent=(sum/200)*100;
        System.out.println("Percentage is "+percent);

        }
    
}
