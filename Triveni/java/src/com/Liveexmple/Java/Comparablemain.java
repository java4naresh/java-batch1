package com.Liveexmple.Java;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Comparablemain {
	public static void main(String[] args) {
		List<Comparablewith> s1=new ArrayList<>();
		s1.add(new Comparablewith("Dell",16,3500));
		s1.add(new Comparablewith("Hp",20,4500));
		s1.add(new Comparablewith("Apple",10,50000));
		Collections.sort(s1);
		for( Comparablewith c:s1) {
			System.out.println(c);
		}
		}

}
