package com.company;

import java.awt.*;

public class Line {
    public Point first, second;

    public Line(double x1, double y1, double x2, double y2, double z1, double z2){
        first = new Point(x1, y1, z1);
        second = new Point(x2, y2, z2);
    }

    public void move(double x, double y, double z) {
        first.setX(first.x + x);
        first.setY(first.y + y);
        first.setZ(first.z + z);

        second.setX(second.x + x);
        second.setY(second.y + y);
        second.setZ(second.z + z);
    }

    public void change(double a, double u, double j) {
        first.change(a, u, j);
        second.change(a, u, j);
    }

    public void rotateX(int degrees) {
        first.rotateX(degrees);
        second.rotateX(degrees);
    }
    public void rotateY(int degrees) {
        first.rotateY(degrees);
        second.rotateY(degrees);
    }
    public void rotateZ(int degrees) {
        first.rotateZ(degrees);
        second.rotateZ(degrees);
    }
    public void draw(Graphics g) {
        g.drawLine((int)first.x, (int)first.y, (int)second.x, (int)second.y);
    }
}
