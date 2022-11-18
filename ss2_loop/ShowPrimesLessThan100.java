package ss2_loop;

import java.util.Scanner;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++){
            boolean primes = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    primes = false;
                }
            }
            if (primes){
                System.out.println(i);
            }
        }
    }
}
