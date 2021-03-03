package com.sai.spring;

public class Engine {
	
      private int acceleration;
      

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	@Override
	public String toString() {
		return "Engine [acceleration=" + acceleration + "]";
	}
      
      
      
}
