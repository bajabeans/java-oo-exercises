package quiz;

public class MultipleChoice extends Question {
	
	private String[] answerList;
	
	public MultipleChoice(String question, String a, String b, String c, String d)
	{
		this.question = question;
		answerList[0] = a;
		answerList[1] = b;
		answerList[2] = c;
		answerList[3] = d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
