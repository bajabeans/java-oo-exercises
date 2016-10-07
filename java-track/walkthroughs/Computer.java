
public class Computer {

	//Fields: (should be private)
	//memory - int
	//size - double
	//processor - double
	//brand - string
	
	private int memory;
	private double size;
	private double processor;
	private String brand;
	
	
	//Behaviors (methods)
	
	//Create a computer
	//constructor = no return type -- name same as class
	//this. refers to fields
	
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	
	//Getters: 
	//Get brand name
	public String getBrand()
	{
		return this.brand;
	}
	
	//Get size
	public double getSize()
	{
		return this.size;
	}
	
	//Get processor speed
	public double getProcessor()
	{
		return this.processor;
	}
	
	//Get memory
	public int getMemory()
	{
		return this.memory;
	}
	
	//Add memory
	public void addMemory(int newMemory)
	{
		if(this.memory + newMemory > 8)
		{
			return;
		}
		else
		{
			this.memory = this.memory + newMemory;
		}
	}
	
	//Setter:
	//Swap processor
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	//Display info as String -- toString!
	public String toString()
	{
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	
	
	
	//to create an instance
	public static void main(String args[])
	{
		Computer myComp = new Computer(4, 2.4, 15.5, "Lenovo");
		System.out.println(myComp.getBrand());
		System.out.println(myComp.getMemory());
		myComp.addMemory(4);
		System.out.println(myComp.getMemory());
		
		Computer yourComputer = new Computer(4, 3.3, 13.3, "Apple");
		System.out.println(yourComputer.getBrand());
		
		//using toString -- don't need to call
		System.out.println(myComp);
	}

}
