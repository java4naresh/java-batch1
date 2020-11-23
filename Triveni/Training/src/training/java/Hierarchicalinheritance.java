package training.java;

public class Hierarchicalinheritance 
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
	class C extends A
	{
		int k;
		C(int i,int k)
		{
			super(i);
			this.k=k;
		}
	}

	class Inhprg1
	{
		public static  void main(String[] args)
		{
			System.out.println(" Main starts");
			A a1=new A(5);
			System.out.println(a1.i);
			
			B b1=new B(7,8);
			System.out.println(b1.i);
			System.out.println(b1.j);
			
			C c1=new C(3,4);
			System.out.println(c1.i);
			System.out.println(c1.k);
			
			System.out.println("Main Ends");
			
		}
	}
}
	

