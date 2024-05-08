package com.example.softtest;

import junit.framework.TestCase;

import org.junit.Test;

public class shapeTest extends TestCase {

    @Test
    public void testCircle(){
        Circle c=new Circle(5);
        assertEquals(78.5,c.area(),0);
        //assertEquals(31.399999618530273,c.perimeter(),0);
        assertEquals(31.399999618530273, c.perimeter(),0);
    }

    @Test
    public void testSquare(){
        Square s=new Square(5);
        assertEquals(25,s.area(),0);
        assertEquals(20,s.perimeter(),0);
    }

    @Test
    public void testT(){
        Triangle t=new Triangle(3,4,5);
        assertEquals(6.0,t.area(),0);

    }

}