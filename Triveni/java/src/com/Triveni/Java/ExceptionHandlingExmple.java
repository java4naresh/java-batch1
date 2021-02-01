package com.Triveni.Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExmple 
{
		
		private static void readFirstFile() throws IOException {
			FileReader fileReader;
			
				fileReader = new FileReader(new File(""));
				System.out.println(fileReader.read());
			
		}

		public static void main(String[] args)  {
			
			String name = "gjhg";
			int num1 = 100;
			int num2 = 10;
			//if(name != null)
			try {

				System.out.println(num1/num2);
				System.out.println(name.charAt(1));
				int[] arr = {1};
				System.out.println(arr[2]);
			}  catch(NullPointerException ne) {
				System.err.println("Name Should not be null");
			} catch(ArithmeticException ae) {
				System.err.println("Please give valid numbers");
			} catch(Exception e) {
				System.err.println("Unknown exception");
			} catch(Throwable e) {
				System.err.println("Unknown exception");
			}
			
			String file = "first";
			try {
				if(file.equals("first"))
					readFirstFile();
				else readSecondFile();
			} catch(FileNotFoundException fne) {
				System.err.println("File Does not contain in provided path, please pass valid path");
			} catch(IOException ioe) {
				System.err.println("Incorrect Input");
			} finally {
				System.out.println("Finally");
			}
			
			
			

		}

		private static void readSecondFile() throws IOException {
			FileReader fileReader;
			
				fileReader = new FileReader(new File(""));
				System.out.println(fileReader.read());
			
		}

	}



