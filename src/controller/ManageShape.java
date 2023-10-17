/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author MINH TUAN
 */
public class ManageShape {

    Library lib = new Library();

    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        double width = lib.getDouble("Please input side width of Rectangle");
        double length = lib.getDouble("Please input length of Rectangle:");
        double radius = lib.getDouble("Please input radius of Circle");
        double a = lib.getDouble("Please input side A of Triangle");
        double b = lib.getDouble("Please input side B of Triangle");
        double c = lib.getDouble("Please input side C of Triangle");
        Rectangle rec = new Rectangle(width, length);
        Circle cir = new Circle(radius);
        Triangle tri = new Triangle(a, b, c);
        rec.printResult();
        cir.printResult();
        tri.printResult();
    }
}
