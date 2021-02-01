package com.Liveexmple.Java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileExmpl {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Filepath");
		System.out.println(file.mkdir());
		File file2=new File("D:\\Filepath\\text.txt");
		System.out.println(file2.createNewFile());
		FileWriter fw =new FileWriter(file2);
		fw.write(66);
		fw.write("Triveni");
		fw.write("/n");
		fw.flush();
		FileReader fr =new FileReader(file2);
		//fr.write(66);
		//fr.write("Triveni");
		//fr.flush();
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Triveni");
		bw.newLine();
		bw.write("Ponnaganti");
		bw.flush();
		BufferedReader br=new BufferedReader(fr);
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			PrintWriter pw=new PrintWriter(file2);
			pw.print(100);
			pw.println();
			pw.print(true);
			pw.flush();
			pw.write(100);


		}
		br.close();
		bw.close();
	}

}
