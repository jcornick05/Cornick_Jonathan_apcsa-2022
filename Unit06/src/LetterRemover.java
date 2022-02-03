//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("them", 'm');
	}

	//add in second constructor
	public LetterRemover(String string, char character)
	{
		setRemover(string, character);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int loc = cleaned.indexOf(lookFor);
		while(cleaned.contains(lookFor + "")) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc+1);
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}