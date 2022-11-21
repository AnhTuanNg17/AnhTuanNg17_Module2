package ss6_inheritance.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radious, String color, double height) {
        super(radious, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI * getRadious() * getRadious() * height;
    }

    @Override
    public double getRadious() {
        return super.getRadious();
    }

    @Override
    public void setRadious(double radious) {
        super.setRadious(radious);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return 2 * getRadious() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "volume=" + getVolume() +
                "area=" + getArea() +
                '}';
    }
}
