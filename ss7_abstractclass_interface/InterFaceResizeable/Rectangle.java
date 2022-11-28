package ss7_abstractclass_interface.InterFaceResizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 2.0;
    private double length = 3.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void resize(double percent) {
        percent = Math.floor(Math.random()*100) / 100;
        width = width * percent;
        length = length * percent;
        getArea();
    }

    @Override
    public String toString() {
        return "The area of this rectangle is : " + getArea();
    }


}
