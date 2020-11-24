package class1;

//PROTECTED ------Within the same class

public class Pro1 
{
    protected int y=20;
    protected void walk()
    {
    	System.out.println("walk left");
    }
    public static void main(String[] args)
    {
		Pro1 p=new Pro1();
		System.out.println(p.y);
		p.walk();
	}
}
