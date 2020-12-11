package corejavaprograms;

public class StringC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="sai";
          String Pv="pavanKalyan";
          String s2="sai";
          String r="pavan";
          String w="Sid";
          String s3=new String("sai");
          String s4=new String("sai");
          String c="";
          String c1="ABCDEFZ";
         char[] ch={'s','e','t','w','g'};
        String s=new String(ch); 
          System.out.println("-------------");
          System.out.println(r.split(""));
          System.out.println(s1.replace("sai", "Ram"));
          System.out.println(s1.intern());
          System.out.println(s1.concat(r));
          System.out.println(c.isEmpty());
          System.out.println(c.equals("ABC"));
          System.out.println(s2.contains("s"));
          System.out.println(Pv.substring(4));
          System.out.println(Pv.substring(2, 5));
          System.out.println(Pv.intern());
          System.out.println(r.charAt(3));
          System.out.println(r.length());
          System.out.println(s1.replace("sid", "pavan"));
          System.out.println(w);
          System.out.println(s1.length());
           System.out.println(s.concat(s1));
           System.out.println(s1.split(c));
          System.out.println(c.compareTo(c1));
          System.out.println(s1.equals(s2));
          System.out.println(s1==s2);
          System.out.println(s2==s3);
         System.out.println(s1.equals(s3));
         System.out.println(s3.equals(s4));

	}

}

