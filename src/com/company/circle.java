package com.company;

import java.util.Scanner;

public class circle {
    Scanner in=new Scanner(System.in);
    double R;
    private static final double  pi=Math.PI;
    double S;
    double l;
    public void setR(double r)
    {
        R=r;
    }
    public double getS()
    {
        return pi*Math.pow(R,2);
    }
    public double getL()
    {
        return 2*pi*R;
    }
}
