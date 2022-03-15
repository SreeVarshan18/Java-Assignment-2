package com.harman.assignment2;

public class Numberoperations {
    public int add2numbers(int x, int y){
        return x+y;
    }

    public int multiply2numbers(int x,int y){
        return x*y;
    }

    public int divisibleby8(int x){
        if(x%8==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
