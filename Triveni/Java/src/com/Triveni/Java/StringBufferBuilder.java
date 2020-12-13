package com.Triveni.Java;

public class StringBufferBuilder {

	private static final String Triveni = null;

	public static void main(String[] args) {
		System.out.println("---String Buffer is Mutable & Legacy&Sycronized(only one thread allow---");
		String fullName = "Triveni";
		fullName = fullName + " Ponnaganti";
		System.out.println(fullName);
		String location = "Hyd";
		StringBuffer sb = new StringBuffer("Java Developer");
		sb.append(" Fresher");
		if (location.equalsIgnoreCase("Hyd")) {
			sb.append("\nCity:HYD");
		} else if (location.equalsIgnoreCase("Chennai")) {
			sb.append("\nCity:Chennai");
		}
		System.out.println(sb);
		
		System.out.println("---String Builder is Mutable & NotLegacy&NotSycronized(Multiple threads allow---");
		String fullName1 = "Triveni";
		fullName1 = fullName1 + " Ponnaganti";
		System.out.println(fullName1);
		String location1 = "Chennai";
		StringBuilder sbb = new StringBuilder("Java Developer");
		sbb.append(" Experience");
		if (location1.equalsIgnoreCase("Hyd")) {
			sbb.append("\nCity:HYD");
		} else if (location1.equalsIgnoreCase("Chennai")) {
			sbb.append("\nCity:Chennai");
		}
		System.out.println(sbb);
		
		
		System.out.println("----StringBuffer & Builder Methods----");
		
			// insert()
		System.out.println("-------Inert Method-----");
		StringBuffer sb1 = new StringBuffer("Mutable string by StringBuffer");
		System.out.println("Original String: " + sb1);
		sb1.insert(18, "  Java ");
		System.out.println("After insert Method:  " + sb1);

		// replace()

		System.out.println("-------Replace Method-----");
		StringBuffer sb2 = new StringBuffer("Mutable string by StringBuffer");
		System.out.println("Original String: " + sb2);
		sb2.replace(18, 32, " StringBuilder ");
		System.out.println(" replace Method output :  " + sb2);

		// charAt()

		System.out.println("-------charAt Method-----");
		StringBuffer sb3 = new StringBuffer("Mutable string by StringBuffer");
		System.out.println("Original String: " + sb3);

		System.out.println(" CharAt Method Output:  " + sb3.charAt(0));

		// Delete()

		System.out.println("-------Delete Method-----");
		StringBuffer sb4 = new StringBuffer("Mutable string by StringBuffer");
		System.out.println("Original String: " + sb4);
		sb4.delete(0, 7);
		System.out.println(" CharAt Method Output:  " + sb4);

		// capcity()

		System.out.println("-------Capacity Method-----");
		StringBuffer sb5 = new StringBuffer("Triveni written by java pgm ");
		System.out.println("Original String: " + sb5);

		System.out.println("Default Capacity: " + sb5.capacity());
		
		
		//To Calculate Time for StringBuffer and StringBuilder
		
				long time=System.currentTimeMillis();
				System.out.println("Time Calculation-"+time);

	}

}
