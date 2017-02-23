/*
 * Brandon Plant
 * Assignment 1
 * IT 2660 Data Structures & Algorithms
 * CRN 13907
 * Due Feb. 23, 2017
 * Spring 2017
 * Chapter 3 exercise 21
 */
import java.util.StringTokenizer;
public class postFixedStack {
	private int[] newArray = new int[0];
    public boolean push(int n) {
        int[] temp = new int[newArray.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            temp[i] = newArray[i];
        }
        temp[temp.length - 1] = n;
        newArray = temp;

        return true;
    }
    
    public int pop() {
        int newPop = newArray[newArray.length-1];
        int[] temp = new int[newArray.length - 1];
        for (int i = 0; i < newArray.length-1; i++) {
            temp[i] = newArray[i];
        }
        newArray = temp;
       return newPop;
    }

    public int expressionParse(String mathExpression) {
    	String thisToken;
    	StringTokenizer tokens = new StringTokenizer(mathExpression);
		while (tokens.hasMoreTokens())
		{
			thisToken = tokens.nextToken();
			if (thisToken.equals("*")) {
				push(pop() * pop());
			} else if (thisToken.equals("/")) {
				push(pop() / pop());
			} else if (thisToken.equals("+")) {
				push(pop() + pop());
			} else if (thisToken.equals("-")) {
				push(pop() - pop());
			} else {
				push(Integer.parseInt(thisToken));
			}
		}
		return pop();
    }
}
