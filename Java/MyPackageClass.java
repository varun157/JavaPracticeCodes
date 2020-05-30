//Package is a collection of similar type of classes and interfaces
//Packages are of two types: User-defined and System-defined
package pack;
public class MyPackageClass
{
    public void display()
    {
        System.out.println("User-defined package");
    }
    public static void main(String args[])
    {
        MyPackageClass m = new MyPackageClass();
        m.display();
    }
}
