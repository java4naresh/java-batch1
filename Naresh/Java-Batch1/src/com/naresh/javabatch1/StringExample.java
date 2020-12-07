package com.naresh.javabatch1;

import java.util.Arrays;

public class StringExample {
	
	int num;
	
	String fullName="Naresh Kambala Java";
	String s = new String("Naresh Kambala");
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	

	/*@Override
	public int hashCode() {
		return 1;
	}*/

	@Override
	public String toString() {
		return "StringExample [num=" + num + ", fullName=" + fullName + ", s=" + s + "]";
	}

	public static void main(String[] args) {
		StringExample se = new StringExample();
		se.setNum(10);
		System.out.println(se.getNum());
		se.setNum(20);
		System.out.println(se.getNum());
		System.out.println(se.getFullName());
		String[] s = se.fullName.split(" ");
		for(int j=0;j<s.length;j++) {
			String h = s[j];
			StringBuffer sb = new StringBuffer(h);
			System.out.print(sb.reverse());
		/*for (int i = h.length()-1; i >= 0; i--) {
			System.out.print(h.charAt(i));
		}*/
		System.out.print(" ");
		}
		System.out.println();
		System.out.println(se.hashCode());
		System.out.println(se.toString());
		String course3 = new String("Java");
		String course = "Java";
		String course2 = "Java";
		
		System.out.println(course == course2);
		System.out.println(course == course3);
		System.out.println(course.equals(course2));
		System.out.println(course.equals(course3));
		String courses = "Java Angular Mysql";
		System.out.println(courses);
		System.out.println(courses.substring(0, 4));
		System.out.println(courses.substring(0, 3));
		String []courses1 = {"Java", "Angular", "Mysql", "AWS"};
		for (String string : courses1) {
			System.out.println(string);
		}
		System.out.println(Arrays.toString(courses1));
		for (int i = 0; i < courses1.length; i++) {
			for (int j = i; j < courses1.length; j++) {
				System.out.println(courses1[i].compareTo(courses1[j]));
				if(courses1[i].compareTo(courses1[j]) < 0) {
					String temp = courses1[i];
					courses1[i] = courses1[j];
					courses1[j] = temp;
				}
			}
		}
		

		System.out.println(Arrays.toString(courses1));
	}

}
