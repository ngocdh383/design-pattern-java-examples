package com.ngocdh.decorator;

public class BorderShapeDecorator extends ShapeDecorator {
    public BorderShapeDecorator(Shape shape) {
        super(shape);
    }


    @Override
    public void draw() {
        super.draw();
        System.out.println("\twith border");
    }
}
