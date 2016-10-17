import java.util.ArrayList;

public class Laptop extends Computer{
	//is-a  laptop is-a computer == good for inheritance
	
	private boolean isClosed;
	
	public Laptop(int memory, double size, double processor, String brand)
	{
		//calls constructor of base class(in this case Computer)
		super(memory, size, processor, brand);
		this.isClosed = true;
	}
	
	public void close()
	{
		this.isClosed = true;
	}
	
	public void open()
	{
		this.isClosed = false;
	}
	
	public static void main(String[] args)
	{
		Laptop l = new Laptop(8,15,1000, "Apple");
		Tablet t = new Tablet(4,10,100, "Lenovo");
		Computer c = new Computer(16,15, 1000, "Lenovo");
		
		System.out.println(l.getBrand());
		System.out.println(t.getBrand());
		System.out.println(c.getBrand());
		
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(c);
		computers.add(l);
		computers.add(t);
		
		
	}
}
