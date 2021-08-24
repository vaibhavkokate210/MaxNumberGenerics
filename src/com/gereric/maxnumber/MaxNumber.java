package com.gereric.maxnumber;

public class MaxNumber<T extends Comparable<T>> 
{
	T x;
	T y;
	T z;
	
	public MaxNumber(T x, T y, T z) 
	{
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void testMaximum()
	{
		MaxNumber.testMaximum(this.x,this.y,this.z);
	}
	public static <T extends Comparable<T>>void testMaximum(T x,T y,T z)
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
		MaxNumber m=new MaxNumber(10,5,20);
		MaxNumber m1=new MaxNumber(100f,545f,220f);
		MaxNumber m2=new MaxNumber("Ajay","Suraj","Rohit");
		m.testMaximum();
        m1.testMaximum();
        m2.testMaximum();
	}


}
