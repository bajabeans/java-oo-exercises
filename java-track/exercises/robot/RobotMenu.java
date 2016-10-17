package robot;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {

	private ArrayList<Robot> robots;
	private Scanner s;
	
	public static void main(String[] args)
	{
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6);
	}
	
	public RobotMenu()
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a new robot!");
		System.out.println("2. Display list of robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute distance between two robots");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		
		return selection;
	}
	
	public void processInput(int selection)
	{
		if(selection ==1)
		{
			createRobot();
		}
		else if (selection == 2)
		{
			displayRobots();
		}
		else if (selection == 3)
		{
			displayRobots();
			Robot r = selectRobot();
			r.changePosition();
			System.out.println("The robot moved! It's new position is: ");
			System.out.println(r.getPosition());
		}
		else if (selection == 4)
		{
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Which way should your robot turn?");
			System.out.println("1. Left   2. Right");
			int turn = s.nextInt();
			if (turn == 1)
			{
				r.changeOrientation("left");
			}
			else if (turn == 2)
			{
				r.changeOrientation("right");
			}
			System.out.println("Your robot is now facing: ");
			System.out.println(r.getOrientation());
		}
		else if (selection == 5)
		{
			displayRobots();
			Robot r = selectRobot();
			displayRobots();
			Robot t = selectRobot();
			
			double dist = r.calcDistance(t);
			System.out.println("The calculated distastance is: ");
			System.out.println(dist);
			
			//FINISH THIS
		}
	}
	
	private void displayRobots()
	{
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot()
	{
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size())
		{
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection - 1); 
	}
	
	private void createRobot()
	{
		System.out.println("Please enter Name: ");
		String name = s.next();
		
		System.out.println("Please enter an X coordinate: ");
		int x = s.nextInt();
		
		System.out.println("Please enter a Y coordinate: ");
		int y = s.nextInt();
		
		System.out.println("Please enter speed: ");
		int speed = s.nextInt();
		while(speed < 0)
		{
			System.out.println("Invalid speed, please try again: ");
			speed = s.nextInt();
		}
		
		System.out.println("Please enter an orientation: ");
		System.out.println("1. North   2. East   3. South   4. West");
		int orient = s.nextInt();
		String orientation = null;
		if( orient == 1)
		{
			orientation = "North";
		}
		else if ( orient == 2)
		{
			orientation = "East";
		}
		else if ( orient == 3)
		{
			orientation = "South";
		}
		else if ( orient == 4)
		{
			orientation = "West";
		}
		robots.add(new Robot(name, x, y, speed, orientation));
	}
}
