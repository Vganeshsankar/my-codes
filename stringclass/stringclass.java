package stringclass;

import lombok.ToString;

public class stringclass {
	
	public static void main(String[] args)
	{
	    String name= "balaji";//literal
		String obj =new String("ganesh,yuvaraj");//non-literal
	    name=name.concat("sankar");
	    System.out.println(name);
		
		System.out.println(name.charAt(5));
		System.out.println(name.equals(obj));
		String a ="ganesh";
		String b ="sankar";
		System.out.println(a.compareTo(b));
		System.out.println(name.endsWith("r"));
		System.out.println(name.replace("balaji", "ganesh"));
		
		String substr=name.substring(4);
		System.out.println(substr);
		
		System.out.println(name.substring(6, name.length()));
		System.out.println(name.contains("ji"));
		System.out.println(name.length());
		
		String sentence=" i am ganesh i have completed java full stack ";
		//first&last space onely
		System.out.println(sentence);
		sentence=sentence.trim();
		System.out.println(sentence);
		
		String result ="i am ganesh i have completed BCA .  ";
		 
		System.out.println(result);
		String [] result1=result.split(" ");
		for(String str:result1 )
		{
 
			System.out.print(str);
		
	    }
		
		
	}
	
}
