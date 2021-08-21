package com.gereric.maxnumber;

public class MaxNumber {

	public static void findMaximum(Integer x,Integer y,Integer z)
	{
		if(x.compareTo(y)>0 && x.compareTo(z)>0)
			System.out.println("Maximum number is X = "+x);
		else if(y.compareTo(x)>0 && y.compareTo(z)>0)
			System.out.println("Maximum number is Y = "+y);
		else
			System.out.println("Maximum number is Z = "+z);
	}
	public static void main(String[] args) 
	{
		Integer x=70;
		Integer y=20;
		Integer z=30;
		findMaximum(x,y,z);
	}


}
