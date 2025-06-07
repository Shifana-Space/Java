import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
    }
}