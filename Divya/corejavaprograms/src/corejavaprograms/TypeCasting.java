package corejavaprograms;

public class TypeCasting
{
	public static void main(String[] args)
	{
		Parent p=new Child4();
		if(p instanceof Child1) 
		{
			Child1 c1=(Child1)p;
			System.out.println("C1 Type");
		}
		else if(p instanceof Child2)
		{
			Child2 c2=(Child2)p;
			System.out.println("C2 Type");
		}
		else if(p instanceof Child3)
		{
			Child3 c3=(Child3)p;
			System.out.println("C3 Type");
		}
		else if(p instanceof Child4)
		{
			Child4 c4=(Child4)p;
			System.out.println("C4 Type");
		}
		else
		{
			Child5 c5=(Child5)p;
			System.out.println("C5 Type");
		}
		
	}

}
