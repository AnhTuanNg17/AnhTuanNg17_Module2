package ss7_abstractclass_interface.InterFaceResizeable;

public class Circle extends Rectangle{
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double width, double length, double radius) {
        super(width, length);
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double width, double length, double radius) {
        super(color, filled, width, length);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "The area of this circle is : " + getArea();
    }
    @Override
    public void resize(double percent) {
        percent = Math.floor(Math.random()*100) / 100;
        radius = radius * percent;
        getArea();
    }
}
