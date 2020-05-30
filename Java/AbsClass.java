//Abstract class is used to provide abstraction
//Abstraction is from 0 to 100%
//Always make a class abstract when there is an abstract method inside the class
//An abstract class can have both abstract as well as non-abstract methods
//We cannot create a direct instance of an abstract class
//If we are inheriting an abstract class then we need to define all the methods which are being declared as abstract in the parent class

public abstract class AbsClass
{
public void met()
    {
        System.out.println("Inside non abstract class");
    }
    public static void main(String args[])
    {
        AbsClass a = new AbsClass();
        a.met();
    }
}
