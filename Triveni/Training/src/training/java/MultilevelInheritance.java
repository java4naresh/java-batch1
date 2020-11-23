package training.java;

public class MultilevelInheritance 
{

	class A
	{
		int i ;
		A(int i)
		{
			this.i=i;
			
		}
	}
	class B extends  A
	{
		int j;
		B(int i, int j)
		{
			super(i);
			this.j=j;
		}
	}
	class C extends B
	{
		int k;
		C(int i,int j, int k)
		{
			super(i,j);
			this.k=k;
		}
	}
	class Inhprg1
	{
		public static  void main(String[] args)
		{
			System.out.println(" Main starts");
			A a1=new A(1);
			System.out.println(a1.i);
			
			B b1=new B(2,3);
			System.out.println(b1.i);
			System.out.println(b1.j);
			
			C c1=new C(4,5,6);
			System.out.println(c1.i);
			System.out.println(c1.j);
			System.out.println(c1.k);
			
			System.out.println("Main Ends");
			
		}
	}

}
