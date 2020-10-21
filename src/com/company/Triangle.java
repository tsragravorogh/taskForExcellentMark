package com.company;

import java.awt.*;

public class Triangle {
    public Line a, b, c, a2, b2, c2, x, y, z;

    public Triangle() {
        this.a = new Line(400, 400, 500, 400, 0, 0);
        this.b = new Line(500, 400, 313, 500, 0, 0);
        this.c = new Line(313, 500, 400, 400, 0, 0);
        this.a2 = new Line(400, 400, 400, 400, 100, 0);
        this.b2 = new Line(400, 400, 313, 500, 100, 0);
        this.c2 = new Line(400, 400, 500, 400, 100, 0);
        this.x = new Line(400, 400, 600, 400, 0, 0);
        this.y = new Line(400, 400, 226, 600, 0, 0);
        this.z = new Line(400, 400, 400, 400, 0, 200);
    }

    public void drawTriangle(Graphics g) {
        this.a.draw(g);
        this.b.draw(g);
        this.c.draw(g);

        this.a2.draw(g);
        this.b2.draw(g);
        this.c2.draw(g);

        this.x.draw(g);
        this.y.draw(g);
        this.z.draw(g);
    }

    public void change(double a, double u, double j) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.change(a, u, j);
        this.b.change(a, u, j);
        this.c.change(a, u, j);

        this.a2.change(a, u, j);
        this.b2.change(a, u, j);
        this.c2.change(a, u, j);

        this.x.change(a, u, j);
        this.y.change(a, u, j);
        this.z.change(a, u, j);
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
        this.a2.rotateX(degrees);
        this.b2.rotateX(degrees);
        this.c2.rotateX(degrees);
        this.x.rotateX(degrees);
        this.y.rotateX(degrees);
        this.z.rotateX(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void rotateY(int degrees) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.rotateY(degrees);
        this.b.rotateY(degrees);
        this.c.rotateY(degrees);
        this.a2.rotateY(degrees);
        this.b2.rotateY(degrees);
        this.c2.rotateY(degrees);
        this.x.rotateY(degrees);
        this.y.rotateY(degrees);
        this.z.rotateY(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void rotateZ(int degrees) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.rotateZ(degrees);
        this.b.rotateZ(degrees);
        this.c.rotateZ(degrees);
        this.a2.rotateZ(degrees);
        this.b2.rotateZ(degrees);
        this.c2.rotateZ(degrees);
        this.x.rotateZ(degrees);
        this.y.rotateZ(degrees);
        this.z.rotateZ(degrees);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void transfer(int l, int m, int n) {
        Point movePoint = new Point(this.a.first.x, this.a.first.y, this.a.first.z);
        moveAll(-movePoint.x, -movePoint.y, -movePoint.z);
        this.a.transfer(l, m, n);
        this.b.transfer(l, m, n);
        this.c.transfer(l, m, n);
        this.a2.transfer(l, m, n);
        this.b2.transfer(l, m, n);
        this.c2.transfer(l, m, n);
        this.x.transfer(l, m, n);
        this.y.transfer(l, m, n);
        this.z.transfer(l, m, n);
        moveAll(movePoint.x, movePoint.y, movePoint.z);
    }

    public void moveAll(double x, double y, double z) {
        this.a.move(x, y, z);
        this.b.move(x, y, z);
        this.c.move(x, y, z);
        this.a2.move(x, y, z);
        this.b2.move(x, y, z);
        this.c2.move(x, y, z);
        this.x.move(x, y, z);
        this.y.move(x, y, z);
        this.z.move(x, y, z);
    }
}
