package com.Ownpgm.Java;
public class NonStaticpgm{
	
	public static void main(String[] args) {
		Battle b1=new Battle();
		b1.shoot1(new Gun());
		b1.shoot2(new Tanker());
		Gun g1=new Gun();
		g1.belt(new Missile());

	}
}
class Gun {
	public void fire() {
		
		System.out.println("Fire Bullets");
	}

	public void belt(Missile r) {
		r.belt();
	}
}

class Tanker {
	public void blast() {
		System.out.println("Blast Missile");
	}
}
class Missile{
	public void belt(){
		System.out.println("Remove Belt");
	}
}

class Battle {
	public void shoot1(Gun g) {
		g.fire();
	}

	public void shoot2(Tanker g) {
		g.blast();
	}

}