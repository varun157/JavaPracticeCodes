//Final keyword: used for restricting the user or programmer
//There are 3 restrictions
//1.If final is used with the class then we cannot inherit the class
//2.If final is usedwith the method then we cannot override the method
//3.If final is used with a variable then we cannot change the value of that variable
public class Final
{
    String name;
    int age;
    final String PAN_CARD_NUMBER;
    public Final(String name, int age, String PAN_CARD_NUMBER)
    {
        this.name=name;
        this.age=age;
        this.PAN_CARD_NUMBER=PAN_CARD_NUMBER;
    }
public void displayInfo()
    {
        System.out.println(name+" "+age+" "+PAN_CARD_NUMBER);
    }
public void changePan(String PAN_CARD_NUMBER)
    {
        this.PAN_CARD_NUMBER=PAN_CARD_NUMBER;
    }
public static void main(String args[])
{
    Final f1 = new Final("Tim Cook",26,"A1286");
    Final f2 = new Final("Jony Ive",24,"A1285");
    Final f3 = new Final("Phil Schiller",25,"A1280");
    Final f4 = new Final("Craig Federighi",22,"A1282");
    f3.changePan("A1222");
    f1.displayInfo();
    f2.displayInfo();
    f3.displayInfo();
    f4.displayInfo();
}
}
