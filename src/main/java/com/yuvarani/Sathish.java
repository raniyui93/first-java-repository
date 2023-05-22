package com.yuvarani;

import java.util.Scanner;

public class Sathish {
    public static void main(String[] args) {
        int result = add(4,3);
        System.out.println(result);
        
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        result = add(v1, v2);
    }

    public static int add(int a, int b){
        return a+b;
    }
}
