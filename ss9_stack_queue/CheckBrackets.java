package ss9_stack_queue;

import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        String given = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        Stack<Integer> bStack = new Stack<>();

        for (int i = 0; i < given.length(); i++){
            if(given.charAt(i) == '('){
                bStack.push(i);
            }
            else if(given.charAt(i) == ')'){
                if(!bStack.isEmpty()){
                    bStack.pop();
                } else {
                    bStack.push(i);
                }

            }
        }
        if(bStack.empty()){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }
}
