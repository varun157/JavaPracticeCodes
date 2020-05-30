public class Student
{
    int rollno;    //Instance variables
    String name;
    int fee;
    String branch;
    static String college = "MIT";   //Static variable: automatically sets for all objects
    public Student(int rollno,String name, int fee, String branch)   //Formal parameter
    {
    this.rollno=rollno;    //Use of this
    this.name=name;
    this.fee=fee;
    this.branch=branch;
    }
    public void display()
    {
    System.out.println("Name is "+name);
    System.out.println("Roll number is "+rollno);
    System.out.println("Fee is "+fee);
    System.out.println("Branch is "+branch);
    System.out.println("College is "+college);
    }

public static void main (String args[])
   {
   Student s1= new Student(1000,"Tim",10000,"CSE");
   Student s2= new Student(1001,"Phil",10000,"CSE");
   Student s3= new Student(1002,"Craig",10000,"CSE");
   Student s4= new Student(1003,"Jony",10000,"CSE");
   s1.display();
   s2.display();
   s3.display();
   s4.display();
   }

}
