package ss7_abstractclass_interface.InterFaceResizeable;

public class Main {
    public static void main(String[] args) {
        int x = (int)(Math.floor(Math.random() * 100));
        Shape [] shapes = new Shape[3];
        shapes [0] = new Rectangle("red",true,x, x );
        shapes [1] = new Square("yellow", false, 5.0 );
        shapes [2] = new Circle("red", true,5,6, x);

        for (Shape a : shapes){
            System.out.println(a);
        }
        for (Shape a : shapes){
            a.resize(Math.random()*100);
        }
        System.out.println("\n");
        System.out.println(shapes);
    }
}
