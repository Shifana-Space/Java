
import java.util.Arrays;

public class bubblesort{

public static void main(String[] args)
{
    int a[]={110,30,25,70,120};
   System.out.println(Arrays.toString(a));
   for(int i=0;i<a.length-1;i++)
   {
   for(int j=0;j<a.length-1;j++)
   {
   if(a[j]>a[j+1])
   {
        int t = a[j];
        a[j]= a[j+1];
        a[j+1]= t;
}
   }
   }
System.out.println(Arrays.toString(a));
   } 
} 
    
