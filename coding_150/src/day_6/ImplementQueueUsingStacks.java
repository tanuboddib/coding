package day_6;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	Stack<Integer> enter;
    Stack<Integer> exit;
    public ImplementQueueUsingStacks() {
        enter = new Stack<>();
        exit  = new Stack<>();
    }
    
    public void push(int x) {
        enter.push(x);
    }
    
    public int pop() {
        if(exit.isEmpty()){
            while(!enter.isEmpty()){
                exit.push(enter.pop());
            }
        }
        return exit.pop();
    }
    
    public int peek() {
        if(exit.isEmpty()){
            while(!enter.isEmpty()){
                exit.push(enter.pop());
            }
        }
        return exit.peek();
    }
    
    public boolean empty() {
        return enter.isEmpty() && exit.isEmpty();
    }
	
}
