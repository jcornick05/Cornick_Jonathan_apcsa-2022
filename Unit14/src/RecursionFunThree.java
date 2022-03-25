//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	public static int luckyThrees(long number){
        if(number==0 || number==3){
            return 0;
        }
        else if(number%10 == 3){
            return 1+luckyThrees(number/10);
        }
        return luckyThrees(number/10);
    }
}