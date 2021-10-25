package com.example.demo.dep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dependent {
	
	@Autowired
    MyInterface mi;
	@Autowired
	MyInterface2 mi2;

	public MyInterface getMi() {
		return mi;
	}

	public void setMi(MyInterface mi) {
		this.mi = mi;
	}

	public MyInterface2 getMi2() {
		return mi2;
	}

	public void setMi2(MyInterface2 mi2) {
		this.mi2 = mi2;
	}

	@Override
	public String toString() {
		return "Dependency [mi=" + mi + ", mi2=" + mi2 + "]";
	}

}
