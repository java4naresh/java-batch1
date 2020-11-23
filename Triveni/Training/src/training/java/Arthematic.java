package training.java;

public class Arthematic 
{
	int num1,num2;

	public int addition(int num1,int num2)
	{
		return num1+num2;
	}
	public int substraction(int num1,int num2)
	{
		return num1-num2;
	}
	public int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	public int divion(int num1,int num2)
	{
		return num1/num2;
	}
	public static void main(String[] args)
	{
		Arthematic ari=new Arthematic();
		System.out.println("Arthematic operations values");
		int add=ari.addition(12,3);
		int sub=ari.substraction(12,3);
		int mul=ari.multiplication(12,3);
		int div=ari.divion(12,3);
		System.out.println("Addition Operation value is :" +add);
		System.out.println("Substraction Operation value is :" +sub);
		System.out.println("Multiplication Operation value is :" +mul);
		System.out.println("Division Operation value is :" +div);
	}
}
