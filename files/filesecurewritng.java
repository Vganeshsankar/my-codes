package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;


public class filesecurewritng 

{
public static void main(String[] args) throws IOException

{

	File name = new File("G:\\secure.txt");
	FileOutputStream obj =new FileOutputStream(name);
	DeflaterOutputStream dos =new DeflaterOutputStream(obj);
	 Scanner scan =new Scanner(System.in);
	 System.out.println("pleas write a contant in the file ");
	 String contant="",answer="";
	 while(true) {
		 contant+=scan.nextLine();
		 System.out.println("do you fines this code");
		 answer=scan.next();
		 if(answer.equalsIgnoreCase("okay"))
		 {
			break; 
		 }
		 
		 dos.write(contant.getBytes());
		 dos.close();
		scan.close();
		
		 
		 
		 
	 }
	
	
}
	
}
