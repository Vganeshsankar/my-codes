package task;

import java.util.Arrays;


public class searchandsort {
	
	public void sort(int[] a1)
	{
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a1[i]<a1[j])
				{
					a1[i]^=a1[j];
					a1[j]^=a1[i]; 
					a1[i]^=a1[j];
					
					
					{
					}
				}
			}
		}
		
	}	
	
	public int search(int [] a1,int low,int high,int key)
	{
		
	
	if(low<high)
	{

	//	int mid =(high+low)/2;
		
		
		int mid=(high+low)/2;
		if(a1[mid]==key)
			return mid;
		else if(a1[mid]>key)
			return search(a1,low,mid,key);
		else if(a1[mid]<key)
			return search(a1,mid+1,high,key);
	}
	
		
		
		
	/*	if(a1[mid]==key)
		{
			return mid;	
		}
		
		else if(a1[mid]>key)
		{
			return search(a1,mid,low,key);
		}
		else if(a1[mid]<key)
		{
			return search(a1,mid+1,high,key);
		}
		
		
		
	}*/
	return -1;
		
	}
	public static void main(String[] args) 
	{
		
	
	int [] a= {12,67,34,90,56,34,98,65};


	searchandsort obj =new searchandsort();
	obj.sort(a);
	System.out.println(Arrays.toString(a));	
	
	int key =56;
	System.out.println(key+" search valuw ="+obj.search(a, key, 0, a.length));
//	obj.search(a,0,a.length, key);
	}

}
