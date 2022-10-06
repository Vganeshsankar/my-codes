package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class fileswright {

	public static void main(String[] args) throws IOException
	{
	
    File obj = new File("G:\\ganeshsankar.txt");
   FileOutputStream fos=new FileOutputStream(obj);
   
   Scanner scan =new Scanner(System.in);
   System.out.println("Please type the content to store inside the file ");
   String contant =scan.nextLine();
   fos.write(contant.getBytes());
    
   System.out.println(obj.getName()+"file successfully writen");
		fos.close();
		scan.close();
	}
}
