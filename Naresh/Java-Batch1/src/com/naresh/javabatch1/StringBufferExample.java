package com.naresh.javabatch1;

public class StringBufferExample {

	public static void main(String[] args) {

		String fullName = "Naresh";
		fullName = fullName+"Kambala";
		String jobLocation = "Chennai";
		long time1 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("FullName:Naresh");
		sb.append("Kambala");
		if(jobLocation.equalsIgnoreCase("Hyderabad")) {
			sb.append("\nCity:Hyderabad");
		} else if(jobLocation.equalsIgnoreCase("Chennai")) {
			sb.append("\nCity:Chennai");
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
		System.out.println(sb);
		long time3 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("FullName:Naresh");
		sb2.append("Kambala");
		if(jobLocation.equalsIgnoreCase("Hyderabad")) {
			sb2.append("\nCity:Hyderabad");
		} else if(jobLocation.equalsIgnoreCase("Chennai")) {
			sb2.append("\nCity:Chennai");
		}
		
		long time4 = System.currentTimeMillis();
		System.out.println(time4-time3);
		System.out.println(sb);
		
	}

}
