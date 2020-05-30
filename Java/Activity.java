//Interface
//It is somewhat like a class but not exactly a class.
//It has a blueprint of a class.
//It has no constructor.
//It provides the functionality of multiple inheritance.
//One class can implement one or several interfaces.
//One class can extend one class and can implement several interfaces.
//Class extends class, interface extends interface, class implements interface.
//Interface is declared with 'interface' keyword.
//It provides you with 100% abstraction.
//Till Java 7, we can only have declaration part inside an interface but in Java 8, we can have the implementation part inside an interface.
//If you are implementing any interfaces your class, then you need to define all the methods which are being declared in that interface.

interface I1
    {
        public void run();
        static int square(int x)
            {
                return (x*x);
            }
    }

interface I2
    {
        public void draw();
        default void msg()
        {
            System.out.println("Default method");
        }
    }

public class Activity implements I1,I2 //mutliple inheritance using interfaces
{
    public void run()
    {
        System.out.println("Running...");
    }
    public void draw()
    {
        System.out.println("Drawing...");
    }

    public static void main (String args[])
    {
        Activity a=new Activity();
        a.run();
        a.draw();
        a.msg();
        System.out.println(I1.square(5));
    }
}


