package Arrays;

import java.util.Scanner;


public class Max_min_Element_in_Array {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert size of array");
		int n= sc.nextInt();
		int []	arr=new int [n];
		System.out.println("Insert array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		
		int min=Integer.MAX_VALUE;
		System.out.println(min);
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
			
		{
			if(arr[i]<min)
		{
				min=arr[i];
			}
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Maximum and Minimum "+max+"&"+min);
		
				}

}




  

