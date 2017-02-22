
package itp120mod4.Ex3.classes;
import java.util.*;

public class SmartRobotDriver 
{

	public static void main(String[] args) 
	 {
		Scanner scan = new Scanner(System.in);

		//smartestRobot will hold the highest IQ'd robot
		String smartestRobotName;
		int smartestRobotIQ;
		
		//nextRobot will be the holder for the Robot just entered
		//     to compare to the smartestRobot
		String nextRobotName;
		int nextRobotIQ;
		
		//set smartestRobot and nextRobot to nothing
		smartestRobotName = " ";
		smartestRobotIQ = 0;
		nextRobotName = " ";
		nextRobotIQ = 0;
		
		//create a new Robot object with the null and zero values
		SmartRobot smartRobot = new SmartRobot(smartestRobotName, smartestRobotIQ);
		
		//start while loop while the nextRobot is not equal to "END"
		while (!nextRobotName.equals("END"))			
		{
			//ask for the next Robot's name (END to quit)
			System.out.println("Enter a Robot's Name: ('END' to quit)");
			nextRobotName=scan.nextLine();
			
			//if user didn't enter "END", then continue 
		    if (!nextRobotName.equals("END"))
		    { 
		    	//ask for the IQ
		    	System.out.println("Enter " + nextRobotName + "'s" + " IQ:");
		    	nextRobotIQ=scan.nextInt();
		    	scan.nextLine();
		    	
		    	//use getter to find out the Robot set to the highest IQ
		    	smartestRobotIQ = smartRobot.getRobotIQ();
			
		    	//compare the Robot just enter to the smartest so far
		    	if (smartestRobotIQ < nextRobotIQ) 
		    	{	
		    		//if the smartestRobot is less then the one just entered
		    		//    then use the setter to set the smartRobot to the next one
		    		smartRobot.setRobotName(nextRobotName);
		    		smartRobot.setRobotIQ(nextRobotIQ);
		    	}	
		    	//if the smartest and nextrobot have the IQ, then keep the smartest
		    	else if (smartestRobotIQ == nextRobotIQ)
		    		{
		    			System.out.println(nextRobotName + " has the same IQ as " 
		    					           + smartRobot.getRobotName() + ". " + smartRobot.getRobotName() 
		    					           + " remains the smartest Robot.");
		    		}
		    }				
		}
		//print out the smartest robot's name and IQ
		System.out.println(smartRobot.toString());
	

	}

}
