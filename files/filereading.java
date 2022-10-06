package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filereading {

	public static void main(String[] args) throws IOException
	{
	 File fileObj=new File("G:\\Basic\\pom.xml");
     FileInputStream fis=new FileInputStream(fileObj);

     int size=fis.available(); 
     byte[] tmp=new byte[size];
     // read and copy to byte array
     fis.read(tmp);

     String data=new String(tmp);
     System.out.println(data+" \n is the content available in the file "+fileObj.getAbsolutePath());

     fis.close();
 }
	
		
	

}
