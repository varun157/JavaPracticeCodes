package myPack;
import pack.*;
public class ClassTwo extends MyPackageClass
{
    public void display()
    {
        System.out.println("Hello Package");
    }
public static void main(String args[])
    {
        ClassTwo c = new ClassTwo();
        c.display();
    }
}
