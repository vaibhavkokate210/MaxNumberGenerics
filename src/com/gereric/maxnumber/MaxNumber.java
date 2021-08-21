package com.gereric.maxnumber;

public class MaxNumber {

	public static void findMaximum(String x,String y,String z)
	{
		if(x.compareTo(y)>0 && x.compareTo(z)>0)
			System.out.println("Maximum String is X = "+x);
		else if(y.compareTo(x)>0 && y.compareTo(z)>0)
			System.out.println("Maximum String is Y = "+y);
		else
			System.out.println("Maximum String is Z = "+z);
	}
	public static void main(String[] args) 
	{
		String x="Ajay",y="Akshay",z="Rohit";
		findMaximum(x,y,z);
	}


}
