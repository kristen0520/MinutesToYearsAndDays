package com.example;

public class Main {

    public static void main(String[] args) {
	    printYearsAndDays(1_000_000_000);
	    printYearsAndDays(5);
	    printYearsAndDays(-5);
	    printYearsAndDays(1_000_000);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else{
            long days = minutes / 1440;
            long years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
