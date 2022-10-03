package inheriteance;

public class MultilevelStuden extends EngineerStudent

{
	
	public void stduent()
	{
		System.out.println("More then topic of student worked in IT Field");
	}
	

	public static void main(String[] args) 
	{
	
		 MultilevelStuden student1=new  MultilevelStuden();
		student1.stduent();
		student1.eng();
		student1.arts();
		
	}

}
