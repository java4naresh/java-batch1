package com.sai.spring;

public class Car {
	
          private Engine engine;
          
          
	/*
	 * public Car() { System.out.println("Car"); }
	 */
		public Car(Engine engine) {
			super();
			this.engine = engine;
		}

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		@Override
		public String toString() {
			return "Car [engine=" + engine + "]";
		}
          
       
}
