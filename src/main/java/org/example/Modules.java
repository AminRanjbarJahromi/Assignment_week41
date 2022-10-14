package org.example;

public class Modules {
    public static double addition (double n1, double n2 ){

        return n1+n2;
    }

    public static double subtraction(double n1, double n2, double n3, double n4, double n5,
                                     double n6, double n7, double n8,double n9, double n10){

        return n1-n2-n3-n4-n5-n6-n7-n8-n9-n10;

    }

    public static double multiplication(double n1, double n2, double n3, double n4, double n5,
                                        double n6, double n7, double n8,double n9, double n10){

        return n1*n2*n3*n4*n5*n6*n7*n8*n9*n10;
    }
    public static double division(double n1, double n2, double n3, double n4, double n5,
                                  double n6, double n7, double n8,double n9, double n10){

        return n1/n2/n3/n4/n5/n6/n7/n8/n9/n10;

    }

    public static void displayMenu (){
        System.out.println("Please Enter Your Number : " );

    }
    public static void displayMenu1 (){
        System.out.println("Please Enter Your Operation : ( + , - , * , / )" );
    }






}
