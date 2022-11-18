package ss3_array_methods;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Enter arr1 ["+ i +"]: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            System.out.print("Enter arr2 ["+ i + "]: ");
            arr2[i] = sc.nextInt();
        }
        int []arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < 3; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 3; i < arr3.length; i++){
            arr3[i] = arr2[i - 3];
        }
        for (int x : arr3){
            System.out.println(x + "\t");
        }

    }
}
