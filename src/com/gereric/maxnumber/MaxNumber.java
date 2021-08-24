package com.gereric.maxnumber;

import java.util.Arrays;

public class MaxNumber<T extends Comparable<T>> 
{
	T arr[];

	public MaxNumber(T ...arr) 
	{
		this.arr=arr;
	}
	
	public void testMaximum()
	{
		MaxNumber.testMaximum(arr);
	}
	public static <T extends Comparable<T>>void testMaximum(T[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
		System.out.println("Maximum element is = "+arr[arr.length-1]);
	}
	public static void main(String[] args) 
	{
		MaxNumber m=new MaxNumber(10,5,20);
		MaxNumber m1=new MaxNumber(100f,545f,220f);
		MaxNumber m2=new MaxNumber("Ajay","Suraj","Rohit");
		m.testMaximum();
        m1.testMaximum();
        m2.testMaximum();
	}


}
