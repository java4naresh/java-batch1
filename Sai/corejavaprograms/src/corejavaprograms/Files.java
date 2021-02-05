package corejavaprograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
      public static void main(String[] args) throws IOException {
		 File f=new File("C:\\Resume");
		System.out.println(f.mkdir());
		 File f2=new File("C:\\Resume\\Details");
		System.out.println(f2.createNewFile());
		FileWriter fw=new FileWriter(f2);
		fw.write(65);

	}
}
