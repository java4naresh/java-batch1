package demo;
class A1
{
	int i;
	A1(int i)
	{
		this.i=i;

	}
}
class B1 extends A1
{
	int j;
	B1(int i,int j)
	{
		super(i);
		this.j=j;
	}
}
class C1 extends B1
{
	int q;
	C1(int i,int j,int q)
	{
		super(i,j);
		this.q=q;
	}
}
class MultiLevel
{
    public static void main(String[] args)
    {
		A1 a1=new A1(8);
		System.out.println(a1.i);
		B1 b1=new B1(4,8);
		System.out.println(b1.i);
		System.out.println(b1.j);
		C1 c1=new C1(6,9,12);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.q);
	}
}
