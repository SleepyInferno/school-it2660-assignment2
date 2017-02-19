import java.util;

String thisToken;

StringTokenizer tokens = new StringTokenizer(mathExpression);

while(tokens.hasMoreTokens())

{ thisToken = tokens.nextToken();

//processing for thisToken goes here

}

My code wont run, I just need some help figuring out what the problem is. Code below.

package postfixed2;

import java.util.*;
import javax.swing.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class postfixed2 {

public static void main(String[] args) {
    Stack<Double> pfStack = new Stack();
    String thisToken;
    double n1, n2, ans;
    String mathExpression = JOptionPane.showInputDialog("Please enter a post         fixed math expression: ");
    StringTokenizer tokens = new StringTokenizer(mathExpression);


    while(tokens.hasMoreTokens()){
       thisToken = tokens.nextToken();

        switch (thisToken){

            case "+":
                n1 = pfStack.pop();
                n2 = pfStack.pop();
                ans = n1 + n2;
                pfStack.push(ans);
                break;

            case "-":
                n1 = pfStack.pop();
                n2 = pfStack.pop();
                ans = n1 - n2;
                pfStack.push(ans);
                break;

            case "*":
                n1 = pfStack.pop();
                n2 = pfStack.pop();
                ans = n1 * n2;
                pfStack.push(ans);
                break;

            case "/":
                n1 = pfStack.pop();
                n2 = pfStack.pop();
                ans = n1 / n2;
                pfStack.push(ans);
                break;

            default:
                pfStack.push(Double.parseDouble(thisToken));
                break;

        }
    } 
    System.out.println(pfStack.pop());
}   

}
//10 + 2 * 6