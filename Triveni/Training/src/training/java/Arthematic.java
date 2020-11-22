package training.java;

public class Arthematic 
{
	int num1,num2;
	public int addition(int num1,int num2)
	{
		return num1+num2;
	}
	public static void main(String[] args)
	{
		Arthematic ari=new Arthematic();
		int sumvalue=ari.addition(12,3);
		System.out.println(sumvalue);
	}
}
