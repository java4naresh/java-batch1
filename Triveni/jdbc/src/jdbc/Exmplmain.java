package jdbc;

public class Exmplmain {

	public static void main(String[] args) {
		Employe e =new Employe(105,"Mouni",70000,"SQL Developer");
		Example2 e2=new Example2();
		e2.show();
		e2.save(e);
		e2.updateEmpName("Tiru", 101);
		e2.delete(105);
		
	}

}
