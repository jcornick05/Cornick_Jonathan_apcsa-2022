//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class FirstLastVowel {
	public static String go( String a )
	{
	   String vowels = "aeiou";
	   String capVowels = "AEIOU";
	   boolean isVowel = false;
	   
		   for(int i = 0; i < vowels.length()-1; i++) {
			   if(a.charAt(0) == vowels.charAt(i) || a.charAt(a.length()-1) == vowels.charAt(i) || a.charAt(0) == capVowels.charAt(i) || a.charAt(a.length()-1) == capVowels.charAt(i)) {
				   isVowel = true;
				   
			   }
		   }
		if(isVowel == false) {
			return "no";
		} else {
			return "yes";
		}
	}
}