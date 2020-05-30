class InAccess
{
private void display()
    {
        System.out.println("Use of Access modifiers");
    }
}

public class Access extends InAccess
{
    public static void main(String args[])
    {
        Access a = new Access();
        a.display();
    }
}

