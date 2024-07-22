package com.Narasimha.java.DAY2;

public class loops {
    public static void main(String[] args) {
        /*
        print all even no in given range

        int no;
        no = 1;       // here the "no" was created
        int maxLimit;
        maxLimit = 100000;

        while( no <=100000){ //here its was excetue.
            if (no % 2 == 0)
                System.out.println(no);
            no++;
        }
        */
        byte maxLimit;
        maxLimit = 100;
        for( byte no=1; no<=100; no++){ // here the loop counter or "no" is create in the loop and the memory relase after the excetue.
            if (no % 2 == 0){
                System.out.println(no);
                /*
                here the for loop used for memory scope and also simplifed code.
                 */
            }
        }






    }
}
