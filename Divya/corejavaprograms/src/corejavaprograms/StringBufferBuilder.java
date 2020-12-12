package corejavaprograms;

public class StringBufferBuilder
{
	public static void main(String[] args)
	{
		/*STRING TYPE(Immutable)
		String fullName="Divya";
		fullName=fullName+" Muskula";
		System.out.println(fullName);*/
		
		//STRING BUFFER(Mutable)-String Buffer is legacy type and Syncronized(only one thread can execute)
		 
		String designation="Developer";
		String[] designTypes= {"Developer","Tester","Analyst","HR"};
		StringBuffer sb=new StringBuffer("Full Name:Divya Reddy");
		sb.append(" Muskula");
		if(designation.equalsIgnoreCase("Developer"))
		{
			sb.append("\nDesignation=Developer");
		}
		else if(designation.equalsIgnoreCase("Tester"))
		{		
			sb.append("\nDesignation=Tester");		
	    }
		else if(designation.equalsIgnoreCase("Analyst"))
		{
			sb.append("\nDesingnation=Analyst");
		}
		else
		{
			sb.append("\nDesignation=HR");
		}
		System.out.println(sb);
		
		//STRING BUILDER(Mutable)-String Builder is not legacy[added in middle version] and non-syncronized(multiple threads can execute at a time)
		
		StringBuilder sb1=new StringBuilder("Full Name:Triveni");
		sb1.append(" Ponnaganti");
		if(designation.equalsIgnoreCase("Developer"))
		{
			sb1.append("\nDesignation=Java Developer");
		}
		else if(designation.equalsIgnoreCase("Tester"))
		{
			sb1.append("\nDesignation=Tester");
		}
		else if(designation.equalsIgnoreCase("Analyst"))
		{
			sb1.append("\nDesignation=Analyst");
		}
		else
		{
			sb1.append("\nDesignation=HR");
		}
		System.out.println(sb1);
		
		//To Calculate Time for StringBuffer and StringBuilder
		
		long time=System.currentTimeMillis();
		System.out.println("Time Calculation-"+time);
	}
}
