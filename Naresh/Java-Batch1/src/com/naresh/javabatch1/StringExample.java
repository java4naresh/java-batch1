package com.naresh.javabatch1;

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

	}

}
