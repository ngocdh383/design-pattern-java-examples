package com.ngocdh.decorator;

public class MarginShapeDecorator extends ShapeDecorator {
    public MarginShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\twith margin");
    }
}
