package corejavaprograms;

public class Method1
{
	public static void main(String[] args)
	{
		Method1 m1=new Method1();
		Method1 m2=new Method1();
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}

}
