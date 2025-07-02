import java.util.Scanner;
public class linearsearch{
    public static void main(String args[]){
        //        0   1  2  3  4
        int a[]= {10,20,30,40,50};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter key:");
        int key = scan.nextInt();
        int flag = 0;
        for (int i=0;i<a.length;i++)
        {
                if(a[i]==key)
            {
                System.out.print("Found at: " +i);
            flag = 1;
                break;
                 }
                }
                if (flag==0)
                System.out.println("Elements not found");
            }
        }

    