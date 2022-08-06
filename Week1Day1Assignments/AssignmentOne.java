package week.day1;

public class AssignmentOne {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1298831711898765416l;
	boolean isPunctured = false;
	String bikeName = "Indian ftr 1200";
	double runningKM = 120.3;
	
	public static void main(String[] args) {
		AssignmentOne twoWheeler = new AssignmentOne();
		System.out.println("My Bike Details"+ "\n Number of wheels: "+twoWheeler.noOfWheels+ "\n Number of mirrors: " +twoWheeler.noOfMirrors+ 
				"\n Chasis number:" +twoWheeler.chassisNumber+ "\n Tyre puncture status:" +twoWheeler.isPunctured+ "\n Bike name:" +twoWheeler.bikeName+ "\n KM:" +twoWheeler.runningKM );
		
	}
}
