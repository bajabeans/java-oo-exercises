import java.util.Objects;

public class Student {

	//Fields:
	//Name First and Last
	//Student ID
	//Credits
	//GPA
	
	private String fName;
	private String lName;
	private int studentID;
	private int credits;
	private double gpa;
	private double tuition = 0;
	private String classStanding;
	private double qualityScore = 0;
	private static Student z; 
	
	
	public Student(String fName, String lName, int studentID)
	{
		this.fName = fName;
		this.lName = lName;
		this.studentID = studentID;
		this.classStanding = "Freshman";
	}
	
	public String getName()
	{
		return this.fName + " " + this.lName;
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public double getGPA()
	{
		if(this.credits == 0)
		{
			this.gpa = 0.0;
		}
		return this.gpa;
		
	}
	
	public int getCredits()
	{
		return this.credits;
	}
	
	public String getClassStanding()
	{
		if(this.credits < 30)
		{
			this.classStanding = "Freshman";
		}
		else if( this.credits < 60)
		{
			this.classStanding = "Sophomore";
		}
		else if(this.credits < 90)
		{
			this.classStanding = "Junior";
		}
		else if(this.credits >= 90)
		{
			this.classStanding = "Senior";
		}
		return this.classStanding;
	}
	
	public void submitGrade(double courseGrade, int courseCredit)
	{
	
		this.credits = this.credits + courseCredit;
		qualityScore = qualityScore + (courseGrade * courseCredit);
		double newGPA = (double)(qualityScore)/(this.credits);
		newGPA = Math.round(newGPA * 1000.0)/1000.0;
		this.gpa = newGPA;
	}
	
	public double computeTuition()
	{

		int semesters = this.credits/15;
		int fullsemesters = semesters * 20000;
		int leftover = this.credits%15;
		double partsemesters = leftover * 1333.33;
		this.tuition = fullsemesters + partsemesters;
		return this.tuition;

	}
	/*
	public Student createLegacy(Student x, Student y)
	{
		String newFN = x.getName();
		String newLN = y.getName();
		int newSID = x.studentID + y.studentID;
		double newGPA = (x.gpa + y.gpa)/2;
		
		Student z = new Student(newFN, newLN, newSID);
		z.gpa = newGPA;
		z.credits = Math.max(x.credits, y.credits);
		return z;
	}
	*/
	
	public static Student createLegacy(Student x, Student y)
	{
		String newFN = x.getName();
		String newLN = y.getName();
		int newSID = x.studentID + y.studentID;
		double newGPA = (x.gpa + y.gpa)/2;
		
		Student z = new Student(newFN, newLN, newSID);
		z.gpa = newGPA;
		z.credits = Math.max(x.credits, y.credits);
		return z;
		
		
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
		if(!(o instanceof Student))
			return false;
		
		Student s = (Student) o;
		
		return Objects.equals(fName, s.fName) && Objects.equals(lName, s.lName)&& Objects.equals(studentID, s.studentID);
		
	}
	
	public String toString()
	{
		return this.getName() + " " + this.getStudentID();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


