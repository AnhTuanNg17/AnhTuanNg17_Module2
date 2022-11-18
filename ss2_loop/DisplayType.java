package ss2_loop;

import java.util.Scanner;

public class DisplayType {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("5. Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++){
                        for (int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 5; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i < 6; i++){
                        for (int j = 6; j > i; j--){
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i; k++ ){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    break;
            }
        }
    }
}
