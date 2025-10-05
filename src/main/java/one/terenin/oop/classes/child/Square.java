package one.terenin.oop.classes.child;

import one.terenin.oop.classes.Shape;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
