package com.company;

import java.awt.*;

public class Triangle {
    public Line a, b, c;

    public Triangle() {
        this.a = new Line(300, 200, 300, 500, 0, 0); //300, 300, 300, 350
        this.b = new Line(300, 500, 500, 200, 0, 0); //300, 350, 320, 200
        this.c = new Line(500, 200, 300, 200, 0, 0); //320, 300, 300, 300
    }

    public void drawTriangle(Graphics g) {
        this.a.draw(g);
        this.b.draw(g);
        this.c.draw(g);
    }

    public void change(double a, double u, double j) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.change(a, u, j);
        this.b.change(a, u, j);
        this.c.change(a, u, j);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }
    public void changeEvenly(double coefficient) {
        change(coefficient, coefficient, coefficient);
    }

    public void rotateX(int degrees){
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.rotateX(degrees);
        this.b.rotateX(degrees);
        this.c.rotateX(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void rotateY(int degrees) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.rotateY(degrees);
        this.b.rotateY(degrees);
        this.c.rotateY(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void rotateZ(int degrees) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.rotateZ(degrees);
        this.b.rotateZ(degrees);
        this.c.rotateZ(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void moveAll(double x, double y, double z) {
        this.a.move(x, y, z);
        this.b.move(x, y, z);
        this.c.move(x, y, z);
    }
}
