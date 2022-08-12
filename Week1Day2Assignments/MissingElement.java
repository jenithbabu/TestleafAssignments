package week1.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] num= {1,2,3,7,4,6,8};
		Arrays.sort(num);//sorting the numbers
		for(int i=0;i<num.length;i++)//// looping through the array (start i from arr[0] till the length of the array)
		{
			if(num[i]!=i+1)// checking if the iterator variable is not equal to the array values
			{
				System.out.println("Missing Element is: " +(i+1));//Printing the missing element
				break;
			}
		}
	}
	

}
