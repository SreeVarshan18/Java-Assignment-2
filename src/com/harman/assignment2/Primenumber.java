package com.harman.assignment2;

import java.util.Scanner;

public class Primenumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Integer lownum,highnum, count;
            System.out.println("Enter Low range");
            lownum= input.nextInt();
            System.out.println("Enter High range");
            highnum= input.nextInt();

            for (int i = lownum; i <= highnum; i++) {
                count = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }



