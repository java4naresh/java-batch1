package com.naresh.javabatch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add(1);
            list.add("Naresh");
            int[] intArr = new int[2];
            String[] strArr = new String[2];
            for (int i = 0; i < list.size(); i++) {
				/*if(list.get(i) instanceof Integer)
					intArr[0] = (Integer) list.get(i);
				else strArr[0] = (String) list.get(i);*/
            	//Integer number = (Integer) list.get(i);
			}
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            list2.add(1);//0
            list2.add(2);//1
            list2.add(3);//2
            System.out.println(list2);
            ArrayList<Integer> list3 = new ArrayList<Integer>();
            list3.addAll(list2);
            list3.add(4);//3
            list3.add(5);//4
            list3.add(1);//5
            //list3.clear();
            System.out.println(list3.contains(4));
            System.out.println(list3.contains(6));
            System.out.println(list3.containsAll(list2));
            //list3.ensureCapacity(10);
            System.out.println(list3.equals(list2));
            System.out.println(list3.get(1));
            System.out.println(list3.indexOf(3));
            System.out.println(list3.isEmpty());
            System.out.println(list3.lastIndexOf(1));
            list3.replaceAll(num -> num*10);
            //replaceall internal code
           /* for(int i=0; i<list3.size();i++) {
            	int num = list3.get(i);
            	list3.set(i, num*10);
            	
            }*/
            list3.removeIf(num -> num == 10);
            // removeif internal code
             /*for(int i=0; i<list3.size();i++) {
        	      if(list3.get(i) == 10) {
        	    	  list3.remove(i);
        	      }
        	
            }*/
            list3.sort((num1,num2) -> num2.compareTo(num1));
            System.out.println(list3);
            list3.add(1, 9);
            System.out.println(list3);
            list3.set(1, 10);
            System.out.println(list3);
           
            
            Collections.sort(list3);
            System.out.println(list3);
            //System.out.println(list3.retainAll(list2));
            System.out.println(list3);
            ArrayList<Integer> list4 = (ArrayList<Integer>) list3.clone();
            list4.add(6);
            System.out.println(list4);
            System.out.println(list3);
            list3.spliterator().forEachRemaining(item -> System.out.println(item));
            for(int num:list3) {
            	System.out.println(num);
            }
            list3.trimToSize();
            Integer[] arr = {1,2,3,4,5,6};
            List<Integer> l = Arrays.asList(arr);
            System.out.println(l);
            
            
	}

}
