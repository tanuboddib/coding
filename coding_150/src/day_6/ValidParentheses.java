package day_6;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else if((st.peek() == '{' && ch == '}') ||
                    (st.peek() == '(' && ch == ')') ||
                    (st.peek() == '[' && ch == ']')){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size() == 0;
    }
	
}
