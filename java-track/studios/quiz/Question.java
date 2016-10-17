package quiz;

public class Question {
	
	protected String question;
	private String answer;
	private boolean isCorrect;
	private int score;
	private int numQuest;
	
	
	public Question(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
		this.isCorrect = false;
		this.score = 0;
		this.numQuest = 0;
	}
	
	public String getQuestion()
	{
		return this.question;
	}
	
	public String getAnswer()
	{
		return this.answer;
	}
	public boolean isCorrect()
	{
		return this.isCorrect;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
