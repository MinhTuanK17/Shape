/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MINH TUAN
 */
public class Triangle extends Shape {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean checkTriangle() {
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            return false;
        }
        return true;
    }

    @Override
    public double getPerimeter() {

        return a + b + c;

    }

    @Override
    public double getArea() {

        return Math.sqrt((getPerimeter()) * (getPerimeter() - a) * (getPerimeter() - b) * (getPerimeter() - c));

    }

    @Override
    public void printResult() {
        System.out.println("==========Triangle=========");
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
        if (checkTriangle()) {
            super.printResult();
        } else {
            System.out.println("It is not a triangle");
        }
    }
}
