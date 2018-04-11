package com.vyom.Actions;

import java.text.NumberFormat;
import java.text.ParsePosition;


    public class Test {
    	
        public static void main(String[] args) 
        {
        String temp = "sffgfg"; // "1"
        NumberFormat numberFormatter = NumberFormat.getInstance();
        ParsePosition parsePosition = new ParsePosition(0);
        numberFormatter.parse(temp, parsePosition);
        if(temp.length() == parsePosition.getIndex()) 
        {
            System.out.println("It is a number");
        } else 
        {
            System.out.println("It is a not number");
        }
    }
}