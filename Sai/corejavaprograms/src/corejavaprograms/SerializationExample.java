package corejavaprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable{
	private String id;
	private String name;
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s=new Student("SVB001","Ram");
		FileOutputStream fs=new FileOutputStream("C:\\New folder\\Student.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(s);
		System.out.println("------Success------");
		FileInputStream fi=new FileInputStream("C:\\New folder\\Student.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Student s1= (Student) oi.readObject();
		fs.close();
		os.close();
	}

}
