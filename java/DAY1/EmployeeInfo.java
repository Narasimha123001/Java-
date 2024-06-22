package com.Narasimha.java.DAY1;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        Working with primitives
         */
        byte age;
        age = 21; // range: -128 to +127
        System.out.println("Age: "+age);

        short salary;
        salary = 32767;  // range: -32,768 to 32,767
        System.out.println("OrderValue: "+salary);

        int annualSalary;
        annualSalary = 393204568; //-2,147,483,648 to 2,147,483,647
        System.out.println("AnnualSalary: "+annualSalary);

        long totalSaving;
        totalSaving = 8965479268976579L;  //9,223,372,036,854,775,808L to 9,223,372,036,854,775,807L (Must mention "L ")
        System.out.println("TotalSaving: "+totalSaving);

        float avgSalary;
        avgSalary = 658956.254F; //Approximately +-3.40282347E to +38F
        System.out.println("AvgSalary: "+avgSalary);

        double avgAnnualIncome;
        avgAnnualIncome = 5896452.245848;  //Approximately ±1.79769313486231570E+308
        System.out.println("AvgAnnualIncome: "+avgAnnualIncome);

        char gender;
        gender = 'M'; // single character
        System.out.println("Gender: "+gender);

        boolean isEligible;
        isEligible = true;   //only for condition statements only....
        System.out.println("Eligible: " +isEligible);

    }
}


/*
output:
Age: 21
OrderValue: 32767
AnnualSalary: 393204568
TotalSaving: 8965479268976579
AvgSalary: 658956.25
AvgAnnualIncome: 5896452.245848
Gender: M
Eligible: true
 */