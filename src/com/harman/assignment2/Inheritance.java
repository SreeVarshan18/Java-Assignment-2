package com.harman.assignment2;

import java.util.Scanner;

public class Inheritance extends Inheritanceparent{
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            Inheritance f=new Inheritance();

            Integer a,b;
            System.out.println("Enter a Number");
            a=s.nextInt();
            b=f.checkpalindrome(a);
            if(b==1){
                System.out.println(+a+" is palindrome");
            }
            else{
                System.out.println(+a+" is not palindrome");
            }


        }
    }
