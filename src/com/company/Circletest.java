package com.company;

import java.util.Scanner;

public class Circletest {

    public static void main(String[] args) {
        circle one=new circle();
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        one.setR(r);
        double S= one.getS();
        double l=one.getL();
        System.out.println("S= "+S+", l= "+l);
    }
}
