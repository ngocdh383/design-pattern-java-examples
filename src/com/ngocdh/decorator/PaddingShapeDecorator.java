package com.ngocdh.decorator;

public class PaddingShapeDecorator extends ShapeDecorator {
    public PaddingShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\twith padding");
    }
}
