package com.company;

public class book {
    String author;
    String name;
    int age;
    int stranitsi;
    String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStranitsi(int stranitsi) {
        this.stranitsi = stranitsi;
    }

    public int getAge() {
        return age;
    }

    public int getStranitsi() {
        return stranitsi;
    }

    public String getAuthor() {
        return author;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
