package com.company;

class Cylinder_home {
    private int radius;
    private int height;

    public Cylinder_home(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

    class rectangle_box{
        private int length;
        private int breadth;

        public rectangle_box() {
            this.length = 4;
            this.breadth = 5;
        }

        public rectangle_box(int length,int breadth) {
            this.length = length;
            this.breadth=breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

public class cylinder {
    public static void main(String[] args) {
        Cylinder_home c = new Cylinder_home(4, 5);
        c.setHeight(20);
        int h = c.getHeight();
        System.out.println("height:" + h);
        c.setRadius(50);
        int r = c.getRadius();
        System.out.println("radius:" + r);
        System.out.println("surafceArea is :" + c.surfaceArea());
        System.out.println("volume is :" + c.volume());

        rectangle_box m = new rectangle_box();
        System.out.println(m.getBreadth());
        System.out.println(m.getLength());
    }
}