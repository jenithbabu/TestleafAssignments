package week1.day2;

public class AssignmentOneCalculator {
	public int calculation(int a,int b,int c)
	{
	int d = a+b+c;
	return d;
	}
	public int subtraction(int e, int f)
	{
	int g = e-f;
	return g;
	}
	public double multiply(double h, double i)
	{
		double j = h*i;
		return j;
	}
	public float divide(float k, float l)
	{
		float m = k/l;
		return m;
		
	}
	public static void main(String[] args) {
		AssignmentOneCalculator obj = new AssignmentOneCalculator();
		int sumOne = obj.calculation(10, 20, 30);
		int sumTwo = obj.subtraction(30, 10);
		double sumThree = obj.multiply(3.5, 2.5);
		float sumFour = obj.divide(6, 3);
		System.out.println("Addition of a+b+c is:" +sumOne +"\nSubtraction of e-f is:" +sumTwo +"\nMultiply of h*i is:"+sumThree +"\nDivision of k/l is:" +sumFour);
			
	}
}
