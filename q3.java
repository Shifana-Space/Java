import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String department = scan.nextLine();

        System.out.println("My name is "+name);
          System.out.println("My score is "+score/10 +"/10");
            System.out.println("My department is " +department);
    }
}
        