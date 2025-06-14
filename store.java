public class store{
    void getsoap (int money)
    {
 System.out.println(money);
    System.out.println("soap purchased");
    }   

void getbag (int money)
    {
 System.out.println(money);
    System.out.println(" bag purchased");
    }   

    void getbook (int money)
    {
 System.out.println(money);
    System.out.println(" book purchased");
    }   


    public static void main(String args[])
    {
        store obj1 = new store();
        obj1.getsoap(20);               
        obj1.getbag(200);               
        obj1.getbook(90);               
    }
}
