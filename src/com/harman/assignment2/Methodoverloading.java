package com.harman.assignment2;

import java.util.Scanner;

public class Methodoverloading {

    public int add(int x,int y){
        return x+y;
    }

    public int add(int x, int y, int z){

        return x+y+z;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Integer a,b,c,sum;
        a = input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        Methodoverloading p=new Methodoverloading();

        sum = p.add(a,b);

        System.out.println(sum);
        sum=p.add(a,b,c);
        System.out.println(sum);


    }
}
