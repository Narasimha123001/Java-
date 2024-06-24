/*
    1 Declare a double variable and assign it a value.
    2 Convert the double variable to an integer variable using explicit casting.
    3 Print both variables to observe the conversion and any data loss.
 */
package com.Narasimha.java.DAY1.Day1Task;

public class ManualConversion {
    public static void main(String[] args) {
        double Age;
        Age = 33;

        int age;
        age = (int)Age;

        System.out.println(Age);
        System.out.println(age);

    }
}

/*
op:
    33.0
    33
 */