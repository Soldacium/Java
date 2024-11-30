package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {

    static class TestShape extends Shape {
        public TestShape(Color color) {
            super(color);
        }

        @Override
        public double getArea() {
            return 0;
        }

        @Override
        public double getPerimeter() {
            return 0;
        }
    }

    @Test
    public void testColorDescription() {
        Shape shape = new TestShape(new Color(100, 150, 200, 255));
        assertEquals("Red: 100, Green: 150, Blue: 200, Alpha: 255", shape.getColorDesciption());
    }

    @Test
    public void testPrintShapeName() {
        Shape shape = new TestShape(new Color(0, 0, 0));
        try {
            shape.printShapeName();
        } catch (Exception e) {
            fail("Method printShapeName() not working");
        }
    }
}