package com.company;

import java.util.Scanner;

public class  Circletest {

    public static void main(String[] args) {
        /*circle one=new circle();
        Scanner in=new Scanner(System.in);
        double r=in.nextDouble();
        one.setR(r);
        double S= one.getS();
        double l=one.getL();
        System.out.println("S= "+S+", l= "+l);*/

        /*leg one = new leg();
        hand two = new hand();
        head three = new head();
        Scanner in=new Scanner(System.in);
        int l1=in.nextInt();
        boolean b=in.nextBoolean();
        int l2=in.nextInt();
        int s1=in.nextInt();
        int l3=in.nextInt();
        one.setLengh(l1);
        one.setFlatfeet(b);
        two.setHandlengh(l2);
        two.setPalmsquare(s1);
        three.setEyecolor("rozovii");
        three.setVision(l3);
        System.out.println(one.getLengh());*/


        book one = new book();
        one.setAge(1992);
        one.setAuthor("1111");
        one.setColor("krasivii");
        one.setStranitsi(1000);
        System.out.println(one.getAuthor());
    }
}
