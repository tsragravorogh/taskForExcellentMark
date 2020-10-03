package com.company;

import java.util.Arrays;

public class Point {
    public double x, y, z;

    public double [] vector;

    public Point(double x, double y, double z) {
        vector = new double[4];

        this.x = x;
        this.vector[0] = x;

        this.y = y;
        this.vector[1] = y;

        this.z = z;
        this.vector[2] = z;


        //{x, y, z, 1}
        this.vector[3] = 1;
    }

    public void setX(double newX) {
        this.x = newX;
        this.vector[0] = newX;
    }

    public void setY(double newY) {
        this.y = newY;
        this.vector[1] = newY;
    }

    public void setZ(double newZ) {
        this.z = newZ;
        this.vector[2] = newZ;
    }

    //[a b c p]
    //[d e f q]
    //[h i j r]
    //[l m n s]
    public double[][] createChangingMatrix(double a, double b, double c, double d, double e, double f, double h, double i, double j, double l, double m, double n) {
        double[][] result = {
                {a, b, c, 0},
                {d, e, f, 0},
                {h, i, j, 0},
                {l, m, n, 1}
        };

        return result;
    }



    public void rotateX(int degrees) {
        double[][] changeMatrix = createChangingMatrix(1, 0, 0,
                0, Math.cos(Math.toRadians(degrees)), Math.sin(Math.toRadians(degrees)),
                        0, -Math.sin(Math.toRadians(degrees)), Math.cos(Math.toRadians(degrees)), 0, 0, 0);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0];
            this.y = vector[1];
            this.z = vector[2];
            vector[3] = 1;


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rotateY(int degrees) {
        double[][] changeMatrix = createChangingMatrix(Math.cos(Math.toRadians(degrees)), 0, -Math.sin(Math.toRadians(degrees)),
                0, 1, 0,
                Math.sin(Math.toRadians(degrees)), 0, Math.cos(Math.toRadians(degrees)), 0, 0, 0);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0];
            this.y = vector[1];
            this.z = vector[2];
            vector[3] = 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rotateZ(int degrees) {
        double[][] changeMatrix = createChangingMatrix(Math.cos(Math.toRadians(degrees)), Math.sin(Math.toRadians(degrees)), 0,
                -Math.sin(Math.toRadians(degrees)), Math.cos(Math.toRadians(degrees)), 0,
                0, 0, 1, 0, 0, 0);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0];
            this.y = vector[1];
            this.z = vector[2];
            vector[3] = 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void transfer(double l, double m, double n) {
        double[][] changeMatrix = createChangingMatrix(1, 0, 0,
                                                        0, 1, 0,
                                                            0, 0, 1,
                                                                l, m , n);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0] / vector[3];
            this.y = vector[1] / vector[3];
            this.z = vector[2] / vector[3];
            vector[3] = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //[a b c p]
    //[d u f q]
    //[h i j r]
    //[l m n s]
    public void change(double a, double u, double j) {
        double[][] changeMatrix = createChangingMatrix(a, 0, 0,
                                                        0, u, 0,
                                                        0, 0, j, 0, 0, 0);
        try {
            this.vector = Utils.multiplyMatrix(this.vector, changeMatrix);
            this.x = vector[0];
            this.y = vector[1];
            this.z = vector[2];
            vector[3] = 1;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
