package errorhandaling;

import java.io.InputStream;
import java.util.Scanner;

public class exception {

	public static void main(String[] args)
	{
		String collect="i am ganeshsankar";
		Scanner scan = new Scanner(System.in);
		
		try 
		{
			System.out.println(" please tell us which index you want?");
		    System.out.println(collect.charAt(scan.nextInt()));
		}
		
		catch(StringIndexOutOfBoundsException str)
		
		{
		
			System.out.println("index number shoude be less than"+collect.length());
			System.out.println(collect.charAt(scan.nextInt()));
			
		}
		finally
		{
			System.out.println("end of the code");
		}
		
		
				
			
		
				
		
		
				
		
		
	}

	
}

