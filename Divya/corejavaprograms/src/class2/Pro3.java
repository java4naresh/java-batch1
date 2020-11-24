package class2;

//PROTECTED----within the other class and other package and using inheritance

import class1.Pro1;
public class Pro3 extends Pro1
{
    public static void main(String[] args)
    {
		Pro3 p=new Pro3();
		System.out.println(p.y);
		p.walk();
	}
    
}
