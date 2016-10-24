package blogz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class User extends Entity{

	private String username;
	private String password;
	private String hashPW;
	
	private static List<User> userlist = new ArrayList<User>();
	private static String hashPassword;
	
	
	public User(String username, String password)
	{
		super();
		
		if(isValidUsername(username))
		{
			this.username = username;
			this.hashPW = User.hashPassword(this.password);
			this.password = password;
			userlist.add(this);
		}
		else
		{
			throw new IllegalArgumentException();
		}
		
		
	}
	
	private static String hashPassword(String password)
	{
		return User.hashPassword;
	}
	
	public boolean isValidPW()
	{
		if(User.hashPassword(this.password) == this.hashPW)
		{
			return true;
		}
		return false;
	}
	public static boolean isValidUsername(String username)
	{
		boolean isValid = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", username);
		return isValid;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public static void getUserlist()
	{
		for(int i = 0; i < userlist.size(); i++)
		{
			System.out.println(User.userlist.get(i));
		}
	}
	public String toString()
	{
		return "Username: " + this.getUsername();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try
		{
			User temp = new User("temp 1", "1ksdjf");
			System.out.println(temp.getUsername());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid password");
			e.printStackTrace();
		}*/
		
		User temp = new User("temp1", "sldkjf");
		User temp2 = new User("poop", "skdjfsd");
		//System.out.println(temp.getUsername());
		User.getUserlist();
	
	}
	}
	

