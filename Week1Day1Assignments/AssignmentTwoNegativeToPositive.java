package week.day1;

public class AssignmentTwoNegativeToPositive {
	public static void main(String[] args) {
		int number = -40;
		
		if (number < 0) {
		System.out.println(number+ " is a negative number");	
			number = -number;
		System.out.println("Negative value converted into positive value: " +number);
		
		
	}
		else {
			System.out.println(number+ " is a positive number");
		}

}
}
