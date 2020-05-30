public class Con
{
public Con()
    {   this(100);
        System.out.println("Hello Blank");
    }
    public Con(int x)
    {
         System.out.println("Hello Parametrised");
    }
    public static void main(String args[])
    {
        new Con();
    }
}
