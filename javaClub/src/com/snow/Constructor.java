package com.snow;

public class Constructor {

        int age;
        float marks;
        String name;

    public Constructor(int age, float marks, String name) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor david=new Constructor(34,9.0f,"david");

    }




}

