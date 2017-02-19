import java.util.*;

import javax.swing.*;

import java.util.Stack;
import java.util.StringTokenizer;

public class postfixed2
{

public static void main(String[] args) {
Stack<Double> pfStack = new Stack();
String thisToken;
double n1=2, n2=10, ans;
String mathExpression = JOptionPane.showInputDialog("Please enter a post fixed math expression: ");
//StringTokenizer tokens = new StringTokenizer(mathExpression,"*+/-");

  
   String digits = mathExpression.replaceAll("[0-9]", ",");
   //System.out.println("digits:::::"+digits);
   StringTokenizer tokens = new StringTokenizer(digits,",");
while(tokens.hasMoreTokens()){
thisToken = tokens.nextToken();
//System.out.println("thisadadfsToken::::"+thisToken);
switch (thisToken){

case "+":

ans = n1 + n2;
pfStack.push(ans);
break;

case "-":
ans = n1 - n2;
pfStack.push(ans);
break;

case "*":
ans = n1 * n2;
pfStack.push(ans);
break;

case "/":
ans = n1 / n2;
pfStack.push(ans);
break;

default:
   System.out.println("defalut:::"+thisToken);
pfStack.push(Double.parseDouble(thisToken));
break;

}
}
System.out.println("pop::::"+pfStack.pop());
}   

}
//10 + 2 * 6

Input

10+2*6

output

pop::::12.0