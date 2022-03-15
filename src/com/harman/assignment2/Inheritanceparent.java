package com.harman.assignment2;

public class Inheritanceparent {

    public int checkpalindrome(int x) {
        Integer y = x, reversenum = 0, reminder;
        while (x > 0) {
            reminder = x % 10;
            reversenum = (reversenum * 10) + reminder;
            x = x / 10;
        }
            if (y == reversenum) {
                return 1;
            } else {
                return 0;
            }

        }

    }



