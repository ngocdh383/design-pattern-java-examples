package com.ngocdh;

import com.ngocdh.decorator.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo Decorator Patter");
        System.out.println("-----------------------");
        Shape circle = new MarginShapeDecorator(new BorderShapeDecorator(new PaddingShapeDecorator(new Circle())));
        circle.draw();
        System.out.println("-----------------------");
        Shape rect = new BorderShapeDecorator(new PaddingShapeDecorator(new Rectangle()));
        rect.draw();
    }
}
