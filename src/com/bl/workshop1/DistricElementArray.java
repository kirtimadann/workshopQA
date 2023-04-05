package com.bl.workshop1;

public class DistricElementArray {

    static  int N = 5;
    public static void main(String[] args) {
        float harmonic = 1;
        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }
        System.out.println(harmonic);
    }

}

