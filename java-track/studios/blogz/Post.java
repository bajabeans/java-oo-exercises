package blogz;

import java.util.Date;

public class Post extends Entity{
	
	private String body;
	private String title;
	private String author;
	private final Date created;
	
	private Date modified;
	
	public Post(String body, String title, String author, Date created)
	{
		super();
		this.body = body;
		this.title = title;
		this.author = author;
		this.created = created;
		this.modified = created;
	}
	
	public void changePost(String newPost)
	{
		Date d = new Date();
		this.body = newPost;
		this.modified = d;	
	}
	
	public void changeTitle(String newTitle)
	{
		Date d = new Date();
		this.title = newTitle;
		this.modified = d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
