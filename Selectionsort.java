import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int a[] = {25, 15, 30, 90, 65};

        System.out.println("Array before sorting:");
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for(int i = 0; i < a.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;}}
{
        System.out.println("Array after sorting:");}
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
