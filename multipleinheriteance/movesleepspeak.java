package multipleinheriteance;

public class movesleepspeak implements moveable
{

	private void connect() 
	{
	
		System.out.println(" you connect a multiple inhertence");
	}
	
	public static void main(String[] args) 
	{
	
	person obj	=new person();
	obj.move();
	
   movesleepspeak obj1 =new movesleepspeak();
   obj1.move();
   obj1.connect();
   
		
	}

	
	public void move()
	{
	System.out.println("Move is different access the interface");	
	}

}
