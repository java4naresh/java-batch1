package class1;

//PRIVATE ACCESS MODIFIER----Private members can be used only 
//within the same class only//

public class Private1
{
    private String s="Divya";
    private void walk()
    {
    	System.out.println("walk right");
    }
    public static void main(String[] args)
    { 
    	Private1 p1=new Private1();
    	System.out.println(p1.s);
    	p1.walk();
		
	}
}
