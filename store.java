public class store
{
    String getName()
    {
        return "shifa" ;
    }
    public static void main(String args[])
    {
        store obj1 = new store();
        String myName = obj1.getName();
        System.out.println(myName);
    }
}
