package constructors;

import org.jaxen.expr.DefaultAbsoluteLocationPath;

public class defaultconstructor {
	int age;
	double salery;
	
	public void car ()
	{
	
		System.out.println(" i not have a car");
		
	}
	
	public defaultconstructor()
	{
		
	System.out.println(" welcome to constructer class.");
	System.out.println("my age is"+age);
	System.out.println(" my salery is"+salery);
	}
	
public  defaultconstructor(int age,double salery)
{
	
	this .age=age;
	this.salery=salery;
	
	System.out.println("my age is "+age+"my salery is "+salery);
	

}

	public static void main(String[] args) {
		
		defaultconstructor obj =new defaultconstructor();
		obj.car();
	defaultconstructor obj1 = new defaultconstructor(21,23567);
		
		
		
	}

}
