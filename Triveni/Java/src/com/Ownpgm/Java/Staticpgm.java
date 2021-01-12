package com.Ownpgm.Java;

public class Staticpgm {
	public static void main(String[] args) {
		Battle1.shoot1(new Gun1());
		Battle1.shoot2(new Tanker());
		Gun1.belt(new Missile());

	}
}
class Gun1 {
	public static void fire() {
		
		System.out.println("Fire Bullets");
	}

	public static void belt(Missile r) {
		r.belt();
	}
}

class Tanker1 {
	public static void blast() {
		System.out.println("Blast Missile");
	}
}
class Missile1{
	public static void belt(){
		System.out.println("Remove Belt");
	}
}

class Battle1 {
	public static void shoot1(Gun1 gun1) {
		gun1.fire();
	}

	public static void shoot2(Tanker g) {
		g.blast();
	}


}
