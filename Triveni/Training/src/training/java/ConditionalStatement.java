package training.java;

public class ConditionalStatement 
{
	public static void main(String[] args)
	{

		int Unit = 20;
		if (Unit <= 15) 
		{
			System.out.println("Current bill is:" +Unit * 10);
		}
		else if (Unit > 10 && Unit <= 15)
		{
			System.out.println("Current bill is:" +Unit * 15);
		} 
		else if (Unit > 15 && Unit <= 20)
		{
			System.out.println("Current bill is:" +Unit * 20);
		} 
		else
		{
			System.out.println("Current bill is:" +Unit * 30);
		}

	}
		
}
		
	



