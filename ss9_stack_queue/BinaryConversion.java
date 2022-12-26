package ss9_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConversion {
    public static void main(String[] args) {
        int number = 16;
        int temp;
        Stack<Integer> stack = new Stack<>();
        System.out.println("\nAfter: " + number);
        System.out.println("\nBefore: ");

        while (number != 0){
            temp = number % 2;
            stack.push(temp);
            number = number / 2;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
