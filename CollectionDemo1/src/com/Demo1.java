package com;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]= {1,4,2,4,54,6};
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("==============");
		int arr1[]=new int[5];
		arr1[0]=000;
		arr1[1]=100;
		arr1[3]=300;
		arr1[4]=400;
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("========For Each============");
		
		for(int r :arr1 ) {
			System.out.println(r);
		}
	}

}

// drawback is size is fixed
// array is a homeginus // or similer kind of data will accept 

			// Collection in java 
					// diminic in natur
					// hetroginus values: any kind of data will accept 
					