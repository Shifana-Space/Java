import java.util.Scanner;
class hello{
    public static void main(String args[])
   {
    for(int i=5;i<=10;i=i+1)
    {
        System.out.println(i);
    }
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("a");
    System.out.println("b");

    for(int i=a;i<=b;i=i+1)
    {
        System.out.println(i);

    }
    }
}
