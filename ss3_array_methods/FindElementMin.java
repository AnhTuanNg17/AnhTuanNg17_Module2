package ss3_array_methods;

import java.util.Scanner;

public class FindElementMin {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Element min best is: "+"\t"+ min);
    }
}
