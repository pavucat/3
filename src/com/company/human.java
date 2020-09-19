package com.company;

public class human {

}
class leg extends human{
    int lengh;
    Boolean flatfeet;

    public void setFlatfeet(Boolean flatfeet) {
        this.flatfeet = flatfeet;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public int getLengh() {
        return lengh;
    }

    public Boolean getFlatfeet() {
        return flatfeet;
    }
}
class hand extends human{
int handlengh;
int palmsquare;

    public void setHandlengh(int handlengh) {
        this.handlengh = handlengh;
    }

    public void setPalmsquare(int palmsquare) {
        this.palmsquare = palmsquare;
    }

    public int getHandlengh() {
        return handlengh;
    }

    public int getPalmsquare() {
        return palmsquare;
    }
}
class head extends human{
double vision;
String eyecolor;

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }

    public double getVision() {
        return vision;
    }

    public String getEyecolor() {
        return eyecolor;
    }
}