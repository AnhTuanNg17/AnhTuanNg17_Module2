package ss16_regex_string.Validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexClass = "^[CAP][0-9]{4}[GHIKLM]$";
        System.out.println("Enter: ");
        String className = scanner.nextLine();

        System.out.println(className.matches(regexClass));

        if(className.matches(regexClass) == true){
            System.out.println("Complete");
        } else {
            System.out.println("Not complete");
        }
    }




}
