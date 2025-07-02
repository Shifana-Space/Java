import java.util.Scanner;

public class binarysearch {
    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80};
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the element");
        int key = scan.nextInt();
        int lb = 0;
        int ub = a.length - 1;
        int flag = 0;

        while(lb <= ub) {
            int mid = (lb + ub) / 2;
            if(a[mid] == key) {
                System.out.println("Found at index: " + mid);
                flag = 1 ;
                break;
            } else if(a[mid] < key) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        if(flag==0) {
            System.out.println("Element not found");
        }

        scan.close(); }
}
