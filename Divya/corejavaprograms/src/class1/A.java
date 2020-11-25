package class1;

//PUBLIC MODIFIER---within the same class

public class A 
{
   public int x=10;
   public static int y=20;
   public void run()
   {
	   System.out.println("Run towards 5km");
   }
   public static void walk()
   {
	   System.out.println("walk");
   }
   public static void main(String[] args)
   {
	   A a1=new A();
	   System.out.println(a1.x);
	   System.out.println(y);
	   a1. run();
	   walk();
}
}
