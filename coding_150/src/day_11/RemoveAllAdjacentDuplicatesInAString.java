package day_11;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInAString {

	public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        boolean dup = false;
        int len = s.length();
        int i = 0;
        while(i < len){
            char ch = s.charAt(i);
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
            i++;
        }
        if(dup){
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
