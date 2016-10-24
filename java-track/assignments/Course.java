import java.util.ArrayList;
import java.util.Objects;

public class Course {

	//Fields:
	//name
	//credits
	//seats remaining
	//roster of students
	
	private String name;
	private int credits;
	private int seats;
	private int remainingSeats;
	private Student[] roster;
	
	
	public Course(String name, int credits, int seats)
	{
		this.name = name;
		this.credits = credits;
		this.seats = seats;
		this.remainingSeats = seats;
		this.roster = new Student[this.seats];
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getRemainingSeats()
	{
		
		return this.remainingSeats;
	}
	

	public boolean addStudent(Student x)
	{
		
		boolean added = true;
		for(int i = 0; i < this.seats - this.getRemainingSeats(); i++)
		{
			if(x.getName() == this.roster[i].getName())
			{
				added = false;
			}

		}
		
		
		if(this.remainingSeats == 0)
		{
			added = false;
		}
		else
		{	
			this.roster[this.roster.length - this.getRemainingSeats()] = x;
			this.remainingSeats = this.getRemainingSeats() - 1;
			added = true;
		}
		

		return added;
		
	}
	
	public String generateRoster(Course x)
	{
		String names = "";
		for(int i = 0; i < this.seats - this.getRemainingSeats(); i++)
		{
			 names = names + roster[i].getName();
		}
		return names;
	}
	
	public double averageGPA()
	{
		double totalGPA = 0;
		int total = 0;
	
		for(int i=0; i < this.seats - this.getRemainingSeats(); i++)
		{
			totalGPA = totalGPA + this.roster[i].getGPA();	
			total += 1;
		}
		double average = totalGPA/total;
		return average;
	}
	
	public String toString()
	{
		return this.getName() + " " + this.credits;
	}
	
	@Override
	public boolean equals(Object o)
	{
		//self check
		if(this == o)
			return true;
		
		//null check
		if(o == null)
			return false;
		
		//type check and cast
		if(!(o instanceof Course))
			return false;
		
		Course c = (Course) o;
		
		return Objects.equals(name, c.name) && Objects.equals(credits, c.credits)&& Objects.equals(seats, c.seats);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
