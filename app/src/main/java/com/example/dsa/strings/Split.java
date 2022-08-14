package com.example.dsa.strings;

public class Split {


    public static void main(String[] args) {
        String str = "This is demo text, and demo line!";
        String[] res = str.split("[,]", 0);
        for(String myStr: res) {
            System.out.println(myStr);
        }
    }
}


