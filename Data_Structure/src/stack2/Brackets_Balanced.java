package stack2;
import java.util.Stack;
public class Brackets_Balanced {
	
	public static boolean checkParenthesis(String expression) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '('){
				stack.push(expression.charAt(i));
			}else if(expression.charAt(i) == '}' || expression.charAt(i) == ']' || expression.charAt(i) == ')') {
				if(stack.isEmpty()) {
					return false;
				}else {
					char pop_value = stack.pop();
					if(expression.charAt(i) == ')' && pop_value != '(') {
						return false;
					}else if(expression.charAt(i) == '}' && pop_value != '{') {
						return false;
					}else if(expression.charAt(i) == ']' && pop_value != '[') {
						return false;
					}
				}
			}
		}
		
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		String exp = "{(a+B)}";
		System.out.println(checkParenthesis(exp));
	}

}
