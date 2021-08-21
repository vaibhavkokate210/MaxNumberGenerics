package com.gereric.maxnumber;

public class MaxNumber {

	public static void findMaximum(Float x,Float y,Float z)
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
		Float x=70.2f,y=20f,z=30f;
		findMaximum(x,y,z);
	}


}
