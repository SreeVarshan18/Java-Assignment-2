package com.harman.assignment2;


public class Methodoverriding extends Methodoverridingparent{
    void fly(){
        System.out.println("parrot can Fly");
    }

    public static void main(String args[]){
        Methodoverriding obj = new Methodoverriding();
        obj.fly();
    }
}






