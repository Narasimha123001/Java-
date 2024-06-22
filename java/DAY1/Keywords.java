package com.Narasimha.java.DAY1;

public class Keywords {
    public static void main(String[] args) {
        int age;
        age = 25; // value=25

        String job;
        job = "Java Developer";

        long pack; //here ,first i gave variable name as "package" its show error "Compile error as we have given keyword as a variable name"
        //thus why i change its "pack"
        pack = 50_00_000;

        System.out.println(age+" "+job+" "+pack);

    }

}
