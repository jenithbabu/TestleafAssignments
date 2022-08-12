package week1.day2;

import java.util.Arrays;

public class DuplicatesInArray {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	Arrays.sort(arr);
	int i;
			for (i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if((arr[i]==arr[j])&&(i!=j))
					{
						System.out.println("Dupliactes numbers in the series: " +arr[j]);
					}
				}
				}
			}
			
}

