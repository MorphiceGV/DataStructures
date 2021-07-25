package lab5;

import java.util.Stack;
/*
 * @author MorphiceGV
 */

public class StackExercise {
	
	
	/*
	 * Given an expression string exp,
	 *  write a program to examine whether the pairs and 
	 *  the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. 
	 *  For example, the program should print true for exp = “[()]{}{[()()]()}” 
	 *  and false for exp = “{[(])” 
	 */
	/** 
	 * 
	 * @param str 
	 * @return  true if balanced
	 */
	public static boolean isBalancedParentheses(String str)
{
		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '{' || ch == '(' || ch == '[') {
				stk.push(ch);
				continue;
			}

//***************************************************************************************
			if (ch == '}') {

			if (!stk.isEmpty() && stk.peek() == '{') {

					stk.pop();
					continue;
				}
			}
//***************************************************************************************
				if (ch == ')') {

					if (!stk.isEmpty() && stk.peek() == '(') {
						stk.pop();
						continue;
					}
				}
//**************************************************************************************
				if (ch == ']') {

					if (!stk.isEmpty() && stk.peek() == '[') {
						stk.pop();
						continue;
					}
				}
	return false;
		}

		return stk.isEmpty();

	}
	
	
	/*
	 * Given a list of daily temperatures, 
	 * produce a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. 
	 * If there is no future day for which this is possible, put 0 instead.
	 * For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73],
	 * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
	 */
	/**
	 * 
	 * @param str 
	 * @return  true if balanced
	 */
	public static int[] calTemp(int[] temp)
	{
		int size = temp.length;
		int[] ret = new int[size];
		
Stack<Integer> stk = new Stack<Integer>();
int i =0;
while( i < temp.length)
{
if(stk.isEmpty() || temp[i] <= temp[stk.peek()])
	{
		stk.push(i);
		i++;
	}
	else
	{
		int lastone = stk.pop(); 
		ret[lastone] = i - lastone;
	}
}
		return ret;
	}
	
	/* This function evaluates "postfix" expressions (also called "Reverse Polish 
	 * Notation"), which are mathematical expressions but with the operators placed
	 * after operands instead of between.
	 * For example: 1 + 2 * 3 + 4  is written as 1 2 3 * + 4 + 
	 * Note: You can assume the single digit number.
	 */
	/**
	 * 
	 * @param str
	 * @return the result of postfix expression
	 */
	
	public static int postfixEvaluate(String exp) {
		
Stack<Integer> stk = new Stack<>();
	for (int i = 0; i < exp.length(); i++) {
	char ch = exp.charAt(i);
	
if(Character.isDigit(ch))
	stk.push(ch -'0');
//test implementation
/*if (!(ch == '*') || !(ch == '+') ||!(ch == '-') || !(ch=='/')) {
			stk.push(ch -'0');
			continue;
		}
*/

//***************************************************************************************
		if (ch == '*') {
			int x = stk.pop();
			int y = stk.pop();
			stk.push( (y *x ));
				continue;
				//test implementation
				/*sum =  y * x ;
				char fsum = (char) sum;
				stk.push(fsum);
				continue;
			*/
		}
//***************************************************************************************
		if (ch == '+') {
			int x = stk.pop();
			int y = stk.pop();
			stk.push((y + x));
			continue;
			//test implementation
/*			if (!stk.isEmpty()) {

					int x = stk.pop();
					int y = stk.pop();
					sum =  y + x ;
					char fsum = (char) sum;
					stk.push(fsum);
					continue;
				}
*/	
			}
//**************************************************************************************
		if (ch == '-') {
			int x = stk.pop();
			int y = stk.pop();
			stk.push((y - x));
			continue;
		/*	if (!stk.isEmpty()) {

					int x = stk.pop();
					int y = stk.pop();
					sum =  y - x ;
					char fsum = (char) sum;
					stk.push(fsum);
					continue;
				}
				*/
			}
//*****************************************************************************************
		if (ch == '/') {

			int x = stk.pop();
			int y = stk.pop();
			stk.push((y / x ));
			continue;
			//test implementation
/*if (!stk.isEmpty()) {
					int x = stk.pop();
					int y = stk.pop();
					sum =  y / x ;
					char fsum = (char) sum;
					stk.push(fsum);
					continue;
				}
*/
			}
	}
	
	return stk.pop();
	}	
	
}
