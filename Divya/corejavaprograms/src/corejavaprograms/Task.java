package corejavaprograms;

public class Task
{
	public static void main(String[] args)
	{
		String accNum="451-SAV-157";
		String s=accNum.replaceAll("\\d","");
        System.out.println("Account Type:"+s);
        String s1=accNum.substring(8, 11);
        System.out.println("Account Number:"+s1);
	}

}
