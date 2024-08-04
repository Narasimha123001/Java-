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

    public static class InventoryItem {

        int itemCode;

        String itemName;

        int QuantityInStock;

        float itemPrize;

        int itemExDate;

        public static void main(String[] args) {
            InventoryItem obj1 =  new InventoryItem();
            InventoryItem obj2 = new InventoryItem();

            obj1.itemCode=12345;
            obj1.itemName="Bourbon Biscuit";
            obj1.itemPrize=20;
            obj1.itemExDate=2027;
            obj1.QuantityInStock=10000;

            obj2.itemCode=67893;
            obj2.itemName="Marie Gold Biscuit";
            obj2.itemPrize=20;
            obj2.itemExDate=2026;
            obj2.QuantityInStock=652014;

            System.out.println("***************");
            System.out.println("Id No: " + obj1.itemCode);
            System.out.println("ItemName: " + obj1.itemName);
            System.out.println("ItemPrize: " + obj1.itemPrize);
            System.out.println("ItemExpDate: " + obj1.itemExDate);
            System.out.println("Stock: " + obj1.QuantityInStock);
            System.out.println("***************");
            System.out.println("Id No: " + obj2.itemCode);
            System.out.println("ItemName: " + obj2.itemName);
            System.out.println("ItemPrize: " + obj2.itemPrize);
            System.out.println("ItemExpDate: " + obj2.itemExDate);
            System.out.println("Stock: " + obj2.QuantityInStock);

        }
    }
}
