package demo;


class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
class B extends A
{
	int j;
	B(int i,int j)
	{
		super(i);
		this.j=j;
	}
}
 class SingleLevelInherit
 {
	 public static void main(String[] args)
	 {
		System.out.println("Main Starts...");
		A a1=new A(5);
		System.out.println(a1.i);
		B b1=new B(7,8);
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println("Main ends...");
	}

 }
