package ss2_loop;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number: ");
        number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i > 0; i++){
            boolean primes = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    primes = false;
                }
            }
            if(primes){
                System.out.println(i);
                count = count + 1;
            }
            if(count == number){
                break;
            }
        }

    }
}
