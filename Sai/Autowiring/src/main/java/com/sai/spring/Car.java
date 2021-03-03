package com.sai.spring;

public class Car {
	
          private Engine engine;
          

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
