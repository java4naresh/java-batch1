package com.Triveni.Java;

public class UpDownCasting {
	public static void main(String[] args) {
		Parent par = new Child6();
		if (par instanceof Child1) {
			Child1 c1 = (Child1) par;
			System.out.println("C1 Type");
		} else if (par instanceof Child2) {
			Child2 c2 = (Child2) par;
			System.out.println("C2 Type");
		} else if (par instanceof Child3) {
			Child3 c3 = (Child3) par;
			System.out.println("C3 Type");
		} else if (par instanceof Child4) {
			Child4 c4 = (Child4) par;
			System.out.println("C4 Type");
		} else if (par instanceof Child5) {
			Child5 c5 = (Child5) par;
			System.out.println("C5 Type");
		} else {
			Child6 c6 = (Child6) par;
			System.out.println("C6 Type");
		}

	}

}
