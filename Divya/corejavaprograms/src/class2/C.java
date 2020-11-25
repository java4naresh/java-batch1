package class2;

//PUBLIC MODIFIER---Within the other class and other package

import class1.A;
public class C 
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
