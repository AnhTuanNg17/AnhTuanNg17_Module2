package ss4_classes_object.BuiltClass;

public class BuiltQuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public BuiltQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.delta;
    }

    public double getRoot() {
        if (delta == 0) {
            double r = -b / (2 * a);
            return r;
        }
        return 0;
    }

    public double getRoot1() {
        if (delta >= 0) {
            double r1 = -(-b - Math.sqrt(delta) / (2 * a));
            return r1;
        }
        return 0;
    }

    public double getRoot2() {
        if (delta >= 0) {
            double r2 = -(-b + Math.sqrt(delta) / (2 * a));
            return r2;
        }
        return 0;
    }

}
