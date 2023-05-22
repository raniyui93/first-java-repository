package com.yuvarani;

public class HelloWorld {
    public static void main(String[] args) {
        String name1 = "i love my country";
        for (i = 0; i < name1.length(); i++) {
            System.out.print(name1.charAt(i));
            System.out.print(" " );
        }
        country();
    }
    static int i = 0;
    public static String country() {
        String name2 = "I love my country is a statement";
        int m = name2.length() - 1;
        for (i = m; i >= 0; i--) {
            System.out.print(name2.charAt(i));
        }
        return name2;
    }
}


