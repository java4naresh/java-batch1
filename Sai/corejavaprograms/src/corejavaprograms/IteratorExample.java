package corejavaprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
           public static void main(String[] args) {
		       List<String> l=new LinkedList<>();    
		           l.add("sai");
		           l.add("rama");
		           l.add("raju");
		           System.out.println(l);
		           Iterator<String> al=l.iterator();
		           while(al.hasNext()){
		        	   System.out.println(al.next());
		           }
		}
}
