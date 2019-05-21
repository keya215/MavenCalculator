package com.keya.maven;

/**
 * calculator
 *
 */

 import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        float n,m;

        System.out.println("Which operation do you want to perform? \n1.Addition\t2.Subtraction\t3.Multiplication\t4.divition\t5.Modulo");
        ch=sc.nextInt();
        System.out.println("You chose:"+ch);

        System.out.println("Enter two numbers:");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.print("Numbers are:" +n);
        System.out.println("   " +m);

        switch (ch){
            case 1:
            {
                System.out.print("Answer is:");
                System.out.println(n+m);
                break;
            }
            case 2:
            {
                System.out.print("Answer is:");
                System.out.println(n-m);
                break;
            }
            case 3:
            {
                System.out.print("Answer is:");
                System.out.println(n*m);
                break;
            }
            case 4:
            {
                System.out.print("Answer is:");
                System.out.println(n/m);
                break;
            }
            case 5:
            {
                System.out.print("Answer is:");
                System.out.println(n%m);
                break;
            }

            default:
                System.out.println("Choose correct option !!");
        }


    }
}

