package ss16_regex_string.Validate;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneRegex = "^\\d{2}\\-\\d{9}$";
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        if(phone.matches(phoneRegex) == true){
            System.out.println("Complete");
        } else {
            System.out.println("Not complete");
        }

    }
    }

