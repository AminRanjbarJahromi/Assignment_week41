package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            Modules.displayMenu();
            double n1 = scanner.nextInt();
            Modules.displayMenu1();
            char operationType = scanner.next().charAt(0);
            Modules.displayMenu();
            double n2 = scanner.nextInt();
            switch (operationType) {
                case '+':
                 Modules.addition(n1,n2);
                    System.out.println(n1 + " + " + n2 + " = "+ Modules.addition(n1,n2));
                    break;
                case '-':
                    double res1 = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + res1);
                    break;
                case '*':
                    double res3 = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + res3);
                    break;
                case '/':
                    double res4 = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + res4);
                    break;
                default:
                    System.out.println(" operation is not valid !");


            }
            System.out.println(" if you want to continue? yes or no : ");
            String continueOperation = scanner.next();
            if (continueOperation.equalsIgnoreCase("no")) {
                //condition = false;
                break;


            }
        }
    }





    }



