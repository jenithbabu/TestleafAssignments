package week1.day2;

public class FibunacciSeries {
	public static void main(String[] args) {
		int fnum1=0, fnum2=1, sum=0, count=11;
		System.out.println(fnum1);
		for(int i=2;i<count;++i)
		{
			sum=fnum1+fnum2;
			fnum1=fnum2;
			fnum2=sum;
			System.out.println(sum);
			
		}
		
	}

}
