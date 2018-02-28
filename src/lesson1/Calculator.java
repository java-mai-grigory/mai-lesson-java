package lesson1;

public class Calculator {
	
	private double result;
	
	public double getResult()
	{
		return result;
	}
	
	public void add(double arg1, double arg2)
	{
		result = arg1 + arg2;
	}
	
	public void add(double arg)
	{
		result += arg;
	}
	
	public static double get_add(double arg1, double arg2)
	{
		return arg1 + arg2;
	}

	public void inc()  { result++; }
	public void decr()  { result--; }

	public Calculator() {
		result = 0;
	}
	
	public int compare(Calculator other)
	{
		if (result > other.result )  return 1;
		else if (result < other.result )  return -1;
		else return 0;
	}
}
