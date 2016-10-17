package robot;

public class Transport extends Robot {
	private boolean occupied = false;
	public Transport(String name, int positionX, int positionY, int speed, String orientation)
	{
		super(name, positionX, positionY, speed, orientation);
	}
	
	public void getStatus()
	{
		if(occupied == false)
		{
			System.out.println("Ready for orders");
		}
		else
		{
			System.out.println("Currently in transport");
		}
	
	}
	public void move(int x, int y)
	{
		occupied = true;
		double dist = this.calcDistanceToPoint(x, y);
		int time = (int)(dist/this.getSpeed());
		System.out.println("I'll be at my location in " + time + " minutes");
		this.positionX = x;
		this.positionY = y;
	}
	
	public void empty()
	{
		occupied = false;
		System.out.println("Transport robot is now empty");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport t1 = new Transport("tra1", 0, 0, 5, "North");
		t1.getStatus();
		
		t1.move(7, 2);
		t1.getStatus();
		t1.empty();
		t1.getStatus();
	}

}
