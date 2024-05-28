package infinite.java4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReader_Scanner {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number:- ");  //out - output
		//in - static method 
//		int num = System.in.read();  //it gives the ASCII value
//		System.out.println(num);
//		System.out.println(num- 40);
		
		
		//BufferedReader - a class works with IO package
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
	
		System.out.println("Enter a number1:- ");
		int num1 = Integer.parseInt(bf.readLine()); //string format you are converting in integer
		System.out.println(num1);
		
		bf.close(); //close the resources
		//BufferedInputStream it always tries to access InputstreamREader
		
		
		//Scanner 
		Scanner sc = new Scanner(System.in);
		int num4 = sc.nextInt();
		System.out.println(num4);

		
		
	}

}
