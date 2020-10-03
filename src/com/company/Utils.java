package com.company;

import java.util.Arrays;

public class Utils {
    public static double[] multiplyMatrix(double[] firstMatrix, double[][] secondMatrix) throws Exception {
        if (firstMatrix.length != secondMatrix.length) {
            throw new Exception("Умножение невозможно. Недопустимые размеры");
        } else {

            double[] res = new double[firstMatrix.length];

            for(int i = 0; i < firstMatrix.length; i++) {
                for (int j = 0; j < secondMatrix.length; j++) {
                    res[i] += firstMatrix[j] * secondMatrix[j][i];
                }
            }
            System.out.println(Arrays.toString(res));
            System.out.println();
            return res;
        }
    }
}
