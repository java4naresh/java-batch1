package com.Liveexmple.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.IIOException;

public class MultithreadingTask 
{

			
			private static void readFirstFile() throws IOException {
				FileReader fileReader;
				
					fileReader = new FileReader(new File(""));
					System.out.println(fileReader.read());
				
			}

			public static void main(String[] args)  {
				
				String name = "Triveni";
				int num1 = 100;
				int num2 = 10;
				if(name != null)
					System.out.println(name.charAt(1));	
				if(num1!=0 && num2 !=0)
					System.out.println(num1/num2);	
				try {
					readFile();
					
				}catch(Exception e) {
					e.printStackTrace();
				}

			}

			private static void readFile(){
				// TODO Auto-generated method stub
				
			}

}

	
				
			






