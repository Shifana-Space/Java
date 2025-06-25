import java.util.ArrayList;
import java.util.Iterator;
class arraylist
{
    public static void main(String[] args)
    {
        ArrayList<String>list = new ArrayList<String>();
        list.add("Hello");
        list.add("1");
        Iterator<String>itr = list.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
    }
}}