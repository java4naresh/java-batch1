package corejavaprograms;

public class Task
{
	public static void main(String[] args)
	{
		/*String accNum="451-SAV-157";
		String s=accNum.replaceAll("\\d","");
        System.out.println("Account Type:"+s);
        String s1=accNum.substring(8, 11);
        System.out.println("Account Number:"+s1);*/
		
		/*String accNum="451-SAV-157";
		String[] accTypes= {"SAV","CURR","PER","JOINT"};
		String s=accNum.substring(4, accNum.length()-4);
		String[] fields=accNum.split("-");
		System.out.println("Account Type:"+fields[1]);
		System.out.println("Account Number:"+fields[2]);*/
		
		String accNum="451-PER-157";
		String[] accTypes= {"SAV","CURR","PER","JOINT"};
		String s=accNum.substring(4, accNum.length()-4);
		String[] fields=accNum.split("-");
		if("SAV".equalsIgnoreCase(fields[1]))
		{
			System.out.println("Account Type:Savings");
		}
		else if("CURR".equalsIgnoreCase(fields[1]))
		{
			System.out.println("Account Type:Current");
		}
		else if("PER".equalsIgnoreCase(fields[1]))
		{
			System.out.println("Account Type:Personal");
		}
		else
		{
			System.out.println("Account Type:Joint");
		}
		System.out.println("Account Number:"+fields[2]);
	}

}
