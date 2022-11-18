package ss3_array_methods;

import java.util.Scanner;

public class FindElementMax {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line: ");
        m = sc.nextInt();
        System.out.println("enter coloumns: ");
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("matrix[" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                max = matrix[i][j];
            }
        }
        System.out.println("Max element" +"\t" + max );
    }
}
