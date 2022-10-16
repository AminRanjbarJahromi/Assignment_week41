package org.example;

import java.util.Scanner;

public class Modules {
    public static double addition (double n1, double n2 ){

        return n1+n2;

    }

    public static double subtraction(double n1, double n2){
        return n1-n2;

    }

    public static double multiplication(double n1, double n2){

        return n1*n2;
    }
    public static double division(double n1, double n2){

        return n1/n2;

    }

    public static void displayMenu (){
        System.out.println("Please Enter Your Number : " );

    }
    public static void displayMenu1 (){
        System.out.println("Please Enter Your Operation : ( + , - , * , / )" );
    }




}