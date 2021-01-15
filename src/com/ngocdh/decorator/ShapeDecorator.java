package com.ngocdh.decorator;

public class ShapeDecorator implements Shape {

    protected Shape mShape;

    public ShapeDecorator(Shape shape) {
        this.mShape = shape;
    }

    @Override
    public void draw() {
        this.mShape.draw();
    }
}
