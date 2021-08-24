package com.gereric.maxnumber;

public class MaxNumber 
{
	public static<T extends Comparable<T>>void findMaximum(T x,T y,T z)
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
		int a=10,b=5,c=20;
		float l=500f,m=20f,n=90f;
		String x="Ajay",y="Akshay",z="Rohit";
		findMaximum(a,b,c);
		findMaximum(x,y,z);
		findMaximum(l,m,n);
	}


}
