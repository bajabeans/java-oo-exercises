package blogz;

public abstract class Entity {

	private final int uid;
	private static int counter = 0;
	
	public final int getUID()
	{
		return this.uid;
	}
	public Entity()
	{
		counter = counter++;
		uid = counter;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
