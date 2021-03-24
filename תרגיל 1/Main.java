package com.company;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);
    public static int getNumberFromUser() {
        String number_string = s.next();
        int result = Integer.valueOf(number_string);

        try {
            System.out.println("number format was wrong...please try again");
        }
        catch (Exception e) {
            System.out.println("caught savely");
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        int number = getNumberFromUser();
    }
}
