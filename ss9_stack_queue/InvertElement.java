package ss9_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);
        number.push(5);
        System.out.println(number);
        int s = number.size();

        Stack<Integer> number1 = new Stack<>();
        for (int i = 0; i < s; i++){
            number1.push(number1.pop());
        }
        System.out.println(number1);
        System.out.println("Mảng đảo ngược là: ");

        Stack<Integer> wWord = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String mWord = scanner.nextLine();

        for (int i = 0; i < mWord.length(); i++){




        }
    }


}
