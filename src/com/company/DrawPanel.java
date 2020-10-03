package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Triangle tr = new Triangle();
    private static final double coefficient = 1.5;
    private static final int angle = 30;
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.BLACK);
        gr.clearRect(0, 0, getWidth(), getHeight());
        tr.drawTriangle(gr);
    }

    public void transformPlus() {
        tr.changeEvenly(coefficient);
        repaint();
    }
    public void transformMinus() {
        tr.changeEvenly(1/coefficient);
        repaint();
    }
    public void rotateX() {
        tr.rotateX(angle);
        repaint();
    }
    public void rotateY() {
        tr.rotateY(angle);
        repaint();
    }
    public void rotateZ() {
        tr.rotateZ(angle);
        repaint();
    }
    public void transferX() {
        tr.transfer(10, 0, 0);
        repaint();
    }
    public void transferY() {
        tr.transfer(0, 10, 0);
        repaint();
    }
    public void transferZ() {
        tr.transfer(0, 0, 10);
        repaint();
    }
}
