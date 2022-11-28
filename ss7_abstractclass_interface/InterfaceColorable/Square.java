package ss7_abstractclass_interface.InterfaceColorable;

public class Square implements  Colorable{
    private double side;
    private boolean filled = true;
    private boolean colorable;

    public Square(){

    }

    public Square(double side, boolean filled) {
        this.side = side;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void howToColor() {
        if (this.colorable) ;
        System.out.println("Color all four side");
    }
    public double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "The are of this square is: " + getArea();

    }
}
