package class1;

//PUBLIC MODIFIER---within the other class,same package

public class B 
{
   public static void main(String[] args)
   {
	   A a1=new A();
	   System.out.println(a1.x);
	   System.out.println(A.y);
	   a1.run();
	   A.walk();
	
}
}
