import java.util.Date;


public class VariableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String trainingLocation;
	String instructor="self";
	float milesFromHome;
	int lightsInRoom,numberOfComputers=5;
	Date lastDayOfClass;
	boolean needMoreCoffee = false;
	int numberOfStudents;
	
	milesFromHome=2;
	trainingLocation= new String ("home");
	lastDayOfClass = new Date("2012/05/18 17:30:00");
	numberOfStudents=numberOfComputers;
	
	System.out.println("trainingLocation = " + trainingLocation);
	System.out.println("milesFromHome " + milesFromHome);
	System.out.println("# students "+ numberOfStudents);
	System.out.println("ldoc " + lastDayOfClass);
	
	
	

	}

}
