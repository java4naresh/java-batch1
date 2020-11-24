package demo;
class L
{
	double p;
	L(double p)
	{
		this.p=p;
	}
}
class M extends L
{
	int q;
	M(double p,int q)
	{
		super(p);
		this.q=q;
	}
}
class N extends L
{
	int r;
	N(double p,int r)
	{
		super(p);
		this.r=r;
	}
}
class HierarchicalInherit
{
   public static void main(String[] args)
   {
	   L l1=new L(4.8);
	   System.out.println(l1.p);
	   M m1=new M(8.4,8);
	   System.out.println(m1.p);
	   System.out.println(m1.q);
	   N n1=new N(2.4,6);
	   System.out.println(n1.p);
	   System.out.println(n1.r);
}
}
