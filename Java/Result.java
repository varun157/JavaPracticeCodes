public class Result
{
    String name;
    int rollNo;
    int sub1;
    int sub2;
    int sub3;
    
    public Result(String name, int rollNo, int sub1, int sub2, int sub3)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    
    public void getInfo()
    {
        int avg=((sub1+sub2+sub3)/3);
        if (avg>60)
        {
        System.out.println(name+" "+rollNo+" "+sub1+" "+sub2+" "+sub3+" "+avg+" "+"Grade:PASS");
        }
        else
        {
        System.out.println(name+" "+rollNo+" "+sub1+" "+sub2+" "+sub3+" "+avg+" "+"Grade:FAIL");
        }
    }
    
    public static void call(int x,Result r)
    {
        if(x==2200)
        {
            r.getInfo();
        }
        else if(x==2201)
        {
            r.getInfo();
        }
        else if(x==2202)
        {
            r.getInfo();
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public static void main (String args[])
    {
        Result r1= new Result("Tim Cook",2200,50,59,40);
        Result r2= new Result("Jony Ive",2201,99,99,90);
        Result r3= new Result("Craig Federighi",2202,91,93,96);
        call(2201,r2);
        
    }
}
    
