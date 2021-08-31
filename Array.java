package myprogramsjava;
import java.util.Scanner;
 public class Array{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  your array size :");
		int ar=sc.nextInt();
		String []arr=new String[ar];
		System.out.println("Enter the elements :");
		for(int i=0;i<ar;i++)
		{
			arr[i]=sc.next();  }
		for (int i=0; i<ar; i++)   
		{  
		System.out.println(arr[i]); }
		System.out.println("Length of the array is :"+arr.length); 

		
	
	

}}
