import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       String result = num?"It is greater":"It is not greater";
       System.out.println(result);
    }
}