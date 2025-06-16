import java.util.Scanner;
public class school
{
    void passorfail(int num)
    {
if(num>35)
{
    System.out.println("pass");
}
else {
    System.out.println("fail");
}

    }
    public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    school obj1 = new school();
    obj1.passorfail(number);
    
}
}