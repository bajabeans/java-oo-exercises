package robot;


public class Robot {

	//Fields:
	//Name - String
	//Position(x,y) - int o double?
	//Speed - int
	//Orientation - String int?
	
	private String name;
	protected int positionX;
	protected int positionY;
	private int speed;
	private String orientation;
	private double distance;
	private double pointDistance;

	//Behaviors:
	//Create a robot
	//can move
	//can rotate
	//how far away from another robot
	//toString
	
	public Robot(String name, int positionX, int positionY, int speed, String orientation)
	{
		this.name = name;
		this.positionX = positionX;
		this.positionY = positionY;
		this.speed = speed;
		this.orientation = orientation;
		this.distance = 0;
		this.pointDistance = 0;
		
	}
	
	//get name
	
	public String getName()
	{
		return this.name;
	}
	
	//get speed
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getPostionX()
	{
		return this.positionX;
	}
	
	public int getPositionY()
	{
		return this.positionY;
	}
	
	public String getPosition()
	{
		return "(" + this.positionX + "," + this.positionY + ")";
	}
	
	//get orientation
	
	public String getOrientation()
	{
		return this.orientation;
	}
	
	//get distance
	
	//public double getDistance()
	//{
		//return this.distance;
	//}
	//calculate distance
	
	public double calcDistance(Robot robotTwo)
	{
		double x = Math.pow((this.positionX - robotTwo.positionX),2);
		double y = Math.pow((this.positionY - robotTwo.positionY),2);
		this.distance = Math.sqrt(x + y);
		return this.distance;
		
	}
	
	public double calcDistanceToPoint(int x, int y)
	{
		double x1 = Math.pow((this.positionX - x),2);
		double y1 = Math.pow((this.positionY - y),2);
		this.pointDistance = Math.sqrt(x1 + y1);
		return this.pointDistance;
		
	}
	//add speed
	public void addSpeed(int newSpeed)
	{
		this.speed = this.speed + newSpeed;
	}
	
	//change position
	public void changePosition()
	{
		if(orientation == "North")
		{
			this.positionY = this.positionY + this.speed;
		}
		else if (orientation == "South")
		{
			this.positionY = this.positionY - this.speed;
		}
		else if (orientation == "East")
		{
			this.positionX = this.positionX + this.speed;
		}
		else if (orientation == "West")
		{
			this.positionX = this.positionX - this.speed;
		}
	}
	
	//change orientation
	public void changeOrientation(String direction)
	{
		if(direction == "left")
		{
			if(orientation == "North")
			{
				this.orientation = "West";
			}
			else if(orientation == "West")
			{
				this.orientation = "South";
			}
			else if(orientation == "South")
			{
				this.orientation = "East";
			}
			else
			{
				this.orientation = "North";
			}
		}
		else
		{
			if(orientation == "North")
			{
				this.orientation = "East";
			}
			else if(orientation == "West")
			{
				this.orientation = "North";
			}
			else if(orientation == "South")
			{
				this.orientation = "West";
			}
			else
			{
				this.orientation = "South";
			}
		}
	}
	
	//toString
	public String toString()
	{
		return "Name: " + this.name + "   Position: (" + this.positionX + "," + this.positionY + ")   Speed: " + this.speed + "   Orientation : " + this.orientation;
	}
	
	
	public static void main(String args[])
	{
		Robot tempRobot = new Robot("George", 2, 0, 5, "North");
		System.out.println(tempRobot.getName());
		System.out.println(tempRobot.getSpeed());
		tempRobot.addSpeed(55);
		System.out.println(tempRobot.getSpeed());
		System.out.println(tempRobot.getPosition());
		tempRobot.changeOrientation("left");
		System.out.println(tempRobot.getOrientation());
		
		Robot tempRobot2 = new Robot("Jimbo", 0, 0, 4, "West");
		
		System.out.println(tempRobot.calcDistance(tempRobot2));
		tempRobot2.changePosition();
		System.out.println(tempRobot2);
		
		
	
	}
}
