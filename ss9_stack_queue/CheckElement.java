package ss9_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class CheckElement {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        if (str.contentEquals(result)){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not palidrome");
        }

    }
}
