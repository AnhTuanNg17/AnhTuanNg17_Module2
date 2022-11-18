package ss4_classes_object.BuiltClass;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quadratic equation 2 Ax2 + Bx + C = 0 ");
        System.out.println("Enter A:");
        double a = scanner.nextDouble();
        System.out.println("Enter B:");
        double b = scanner.nextDouble();
        System.out.println("Enter C:");
        double c = scanner.nextDouble();

        BuiltQuadraticEquation builtQuadraticEquation = new BuiltQuadraticEquation(a, b, c);
        if (builtQuadraticEquation.getDiscriminant() >= 0) {
            if (builtQuadraticEquation.getDiscriminant() == 0) {
                System.out.println("The equation has two roots" + builtQuadraticEquation.getRoot());
            } else {
                System.out.println("The equation has two roots" + builtQuadraticEquation.getRoot1() + builtQuadraticEquation.getRoot2());
            }
        } else {
            System.out.println("The equa has no real roots ");

        }


    }
}
