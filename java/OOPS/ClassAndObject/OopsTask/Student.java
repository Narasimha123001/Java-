package com.Narasimha.java.OOPS.ClassAndObject.OopsTask;

public class Student {
    String Name;

    byte age;

    Character Grade;

    int RegNo;

    String Branch;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.Name="Sri";
        student1.age=21;
        student1.Grade ='A';
        student1.RegNo = 6589752;
        student1.Branch = "CSE";

        student2.Name="Devi";
        student2.age=22;
        student2.Grade ='B';
        student2.RegNo = 54515;
        student2.Branch = "ECE";

        student3.Name="hari";
        student3.age=20;
        student3.Grade ='F';
        student3.RegNo =5332;
        student3.Branch = "MEC";

        System.out.println("***********************");
        System.out.println("STUDENT 1 DETAILS");
        System.out.println("NAME: " +student1.Name);
        System.out.println("AGE: " +student1.age);
        System.out.println("REG NO: " +student1.RegNo);
        System.out.println("BRANCH: " +student1.Branch);
        System.out.println("GRADE: " +student1.Grade);

        System.out.println("***********************");
        System.out.println("STUDENT 2 DETAILS");
        System.out.println("NAME: " +student2.Name);
        System.out.println("AGE: " +student2.age);
        System.out.println("REG NO: " +student2.RegNo);
        System.out.println("BRANCH: " +student2.Branch);
        System.out.println("GRADE: " +student2.Grade);

        System.out.println("************************");
        System.out.println("STUDENT 3 DETAILS");
        System.out.println("NAME: " +student3.Name);
        System.out.println("AGE: " +student3.age);
        System.out.println("REG NO: " +student3.RegNo);
        System.out.println("BRANCH: " +student3.Branch);
        System.out.println("GRADE: " +student3.Grade);
    }
}
