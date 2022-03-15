package com.harman.assignment2;

import java.util.Scanner;

public class Mainoperationfile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Numberoperations n = new Numberoperations();

        Integer a, b, sum, mul, div, d;
        System.out.println("Enter 1st Number to add");
        a = input.nextInt();
        System.out.println("Enter 2nd Number to add");
        b = input.nextInt();

        sum = n.add2numbers(a, b);
        System.out.println(sum);
        System.out.println("Enter 1st Number to multiply");
        a = input.nextInt();
        System.out.println("Enter 2nd Number to multiply");
        b = input.nextInt();
        mul = n.multiply2numbers(a, b);
        System.out.println(mul);
        System.out.println("Enter Number to check divisibility of 8");
        d = input.nextInt();
        div = n.divisibleby8(d);
        if (div == 1) {
            System.out.println(+d + " is divisible by 8");
        } else {
            System.out.println(+d + " is not divisible by 8");
        }

    }}

