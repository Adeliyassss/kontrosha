package com.company;

public class Aspirant extends Student{
    String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        int a;
        if (getMark()==5){
            return a= 2500;
        }else{
            return a=2200;
        }
    }


}
