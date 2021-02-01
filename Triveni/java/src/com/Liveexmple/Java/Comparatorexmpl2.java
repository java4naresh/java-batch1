package com.Liveexmple.Java;

import java.util.Comparator;

public class Comparatorexmpl2 implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName()) ;
	}



}
