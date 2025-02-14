package day_6;

import java.util.Stack;

public class BackSpaceStringCompare {
	
	public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }

        for(char ch:t.toCharArray()){
            if(ch == '#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else{
                st2.push(ch);
            }
        }

        if(st1.size() != st2.size()){
            return false;
        }

        while(!st1.isEmpty() && !st2.isEmpty() && st1.peek() == st2.peek()){
            st1.pop();
            st2.pop();
        }
        return st1.isEmpty() && st2.isEmpty();
    }

}
