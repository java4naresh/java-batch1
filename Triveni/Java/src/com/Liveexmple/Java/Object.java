package com.Liveexmple.Java;
public class Object 
{
		int date ;
	    public static void main(String[] args) throws CloneNotSupportedException {
	        Object date = new Object();
	        System.out.println(date.toString());
	        Object date2 = (Object) date.clone();
	        System.out.println(date2.toString());
	    }
		public void setDaemon(boolean b) {
			// TODO Auto-generated method stub
			
		}
	}


