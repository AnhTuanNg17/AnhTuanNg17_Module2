package ss6_inheritance.CircleAndCylinder;

public class Circle {
    private double radious;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radious * radious * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                "area=" + getArea() +
                '}';
    }
}
