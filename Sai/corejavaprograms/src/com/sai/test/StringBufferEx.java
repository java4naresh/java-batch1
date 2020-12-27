package com.sai.test;

public class StringBufferEx {

	public static void main(String[] args) {
           StringBuffer sb=new StringBuffer();
           System.out.println(sb.capacity());  
           sb.append("Sai");
           System.out.println(sb);
           System.out.println(sb.capacity());
           sb.append(" thalla.saikumar25@gmail.com this is email addresss");
           System.out.println(sb.capacity());
           System.out.println(sb);
	}

}
