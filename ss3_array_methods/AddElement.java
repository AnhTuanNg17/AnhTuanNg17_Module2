package ss3_array_methods;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int atIndex = 1;
        int n = 5;
        int value = 9;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.print("Before insert");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
        for (int i = atIndex; i < atIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[atIndex] = value;
        System.out.print("After insert");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.print("");
    }
}
