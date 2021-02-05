package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Expl3main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final long serialVersionUID = 1L;
		File file=new File("D:\\Filepath1");
		System.out.println(file.mkdir());
		File file2=new File("D:\\Filepath1\\DBMS2.txt");
		System.out.println(file2.createNewFile());
		
		Employe e1 =new Employe(105,"Mouni",20000,"SQL Developer");
		Employe e2=new Employe(106,"Divya",30000,"JAVA Developer");
		FileOutputStream fos=new FileOutputStream(file2);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		FileInputStream fis=new FileInputStream("D:\\Filepath1\\DBMS2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employe e3=(Employe) ois.readObject();
		Employe e4=(Employe) ois.readObject();
		System.out.println(e3);
		System.out.println(e4);
		oos.close();
		fos.close();
		 ois.close();
		 fis.close();
		

	}

}
