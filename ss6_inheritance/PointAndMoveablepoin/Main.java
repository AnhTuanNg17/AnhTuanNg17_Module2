package ss6_inheritance.PointAndMoveablepoin;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3f, 4f);
        System.out.println(point);
        point.setX(3.34f);
        point.setY(4.43f);
        System.out.println(point);
        point.setXY(3.34f, 4.3f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);


    }
}
