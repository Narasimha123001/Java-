package com.Narasimha.java.DAY2;

public class SwitchCondition {
    /*
    brand:iQoo,Apple,Nokia.
    Membership:Diamond,Gold,Silver,Brorzen.
     */
    public static void main(String[] args) {
        String Brand;
        Brand="Samsung";
        int ProductPrize;
        ProductPrize =300000;
        int finalPrize;
        int ProductDiscount;
        char Membership;
        int Discount;
        ProductDiscount =1;
        Membership ='D';
        switch (Brand) {
            case "Apple":
                if (Membership == 'D'){
                    ProductDiscount =20;
                } else if(Membership == 'G'){
                    ProductDiscount = 15;
                } else if(Membership == 'S'){
                    ProductDiscount = 10;
                } else {
                    ProductDiscount = 5;
                }
                break;
            case "Samsung":
                if (Membership == 'D'){
                    ProductDiscount =35;
                } else if(Membership == 'G'){
                    ProductDiscount = 30;
                } else if(Membership == 'S'){
                    ProductDiscount = 25;
                } else {
                    ProductDiscount = 20;
                }
            default:
                ProductDiscount =5;

        }
        Discount = ProductPrize * ProductDiscount / 100;
        finalPrize = ProductPrize - Discount;
        System.out.println("Brand: "+Brand);
        System.out.println("ProductDiscount: "+ProductDiscount);
        System.out.println("Discount: "+Discount);
        System.out.println("FinalPrize: "+finalPrize);



    }
}
