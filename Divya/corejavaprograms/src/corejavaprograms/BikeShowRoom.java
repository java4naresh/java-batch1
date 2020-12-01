package corejavaprograms;

 class Bikes
{
	String brand;
	int speed;
	double milage;
	String colour;
	long price;
	
	
	Bikes(String br,int s,double m,String c,long p)
	{
		brand=br;
		speed=s;
		milage=m;
		colour=c;
		price=p;
		
	}
	Bikes(String br,int s,double m,long p)
	{
		brand=br;
		speed=s;
		milage=m;
		price=p;
	}
	Bikes(String br,String c,long p)
	{
		brand=br;
		colour=c;
		price=p;
	}
	Bikes(String br,long p)
	{
		brand=br;
		price=p;
		
	}
}
class BikeShowRoom
{
	public static void main(String[] args)
	{
		Bikes b1=new Bikes("Ns200",150,20.0,"White",140000);
		Bikes b2=new Bikes("Pulsar150",120,25.5,80000);
		Bikes b3=new Bikes("Pulsar180","Blue",90000);
	    Bikes b4=new Bikes("Enfield",200000);
	    System.out.println("======FIRST PROCESS=====");
	    System.out.println("Brand Name- "+b1.brand);
	    System.out.println("Speed- "+b1.speed);
	    System.out.println("Milage- "+b1.milage);
	    System.out.println("Colour- "+b1.colour);
	    System.out.println("Price- "+b1.price);
	    System.out.println("======SECOND PROCESS=====");
	    System.out.println("Brand Name- "+b2.brand);
	    System.out.println("Speed- "+b2.speed);
	    System.out.println("Milage- "+b2.milage);
	    System.out.println("Price- "+b2.price);
	    System.out.println("=======THIRD PROCESS=====");
	    System.out.println("Brand Name- "+b3.brand);
	    System.out.println("Colour- "+b3.colour);
	    System.out.println("Price- "+b3.price);
	    System.out.println("=======FOURTH PROCESS=====");
	    System.out.println("Brand Name- "+b3.brand);
	    System.out.println("Price- "+b3.price);
	    
	    
		
	}
}
