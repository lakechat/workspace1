public class Derived2 extends Derived1
{
    public Derived2()
    {
        System.out.println("Message 3 : In the derived2 class\'s constructor.");
       
    }
 
    public static void main(String args[])
    {
        Derived2 d2 = new Derived2();
    }
}