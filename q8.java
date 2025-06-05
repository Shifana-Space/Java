// to get in termianl point which is greater 
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        if(num1==num2)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Not equal");
                   }
    }
}