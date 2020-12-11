package corejavaprograms;

public class StringTask {
        String acNo="6023-svng-343";

      public void AccNo(){
    	  System.out.println("AccountNo:"+acNo.substring(0, 4));
      }
      public void AccType(){
    	  System.out.println("AccountType:"+acNo.substring(5, 8));
      }
       
}
