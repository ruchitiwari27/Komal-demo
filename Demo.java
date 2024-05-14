class A 
{
   // int a;
    //int b;

    A()
    {
        System.out.println("default constructor");
    }
    A(int a,int b)
    {
       // this();
        System.out.println(" double parameterised constructor ");
    }
    A(int a,int b,int c)
    {
        this(1,2);
         System.out.println(" triple parameterised constructor ");
     }
}
    class ChildA extends A
    { 
        ChildA()
        {
        super();
        System.out.println("default constructor ");
        }

        ChildA(int a, int b)
        {
           super(1,2);
           
            System.out.println("this is double  parameterised constructor");
        }
        ChildA(int a,int b,int c)
        {
            
                 super(10,11,12);
                 System.out.println("  child class triple parameterised constructor ");
             }
        }
    
       // void display()
       // {
       // System.out.println("child class of A class");

   // }

    
    
 public class Demo
{
public static void main(String[]args)
{
    ChildA r = new ChildA(11,12,4);
   // r.display();
   //new A(11,12);
}
}
