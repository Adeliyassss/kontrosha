package com.company;

public class Student {
    String firstName, lastName, group;
    double avgMark;

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }
    public double getMark() {
        return avgMark;
    }
    public double getScholarship(){
        int a;
        if (this.avgMark==5){
            return a= 2000;
        }else{
            return a=1900;
        }
    }


}
