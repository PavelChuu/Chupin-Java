package com.PavelChuu;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        float c;

        System.out.print("Введите целое число для переменной a: ");
        a = scanner.nextInt();
        System.out.print("Введите целое число для переменной b: ");
        b = scanner.nextInt();

        if (a == b)
            System.out.println("a = b");
        else if (a > b)
            System.out.println("a > b");
        else if (a < b )
            System.out.println("a < b");

        for (int i = 0; i < 4; i++){
            switch (i) {
                case 0:
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case 1:
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;

                case 2:
                    System.out.println(a + "*" + b + "=" + a * b);
                    break;

                case 3:
                    c = (float) a / b;
                    System.out.println(a + "/" + b + "=" + c);
                    break;
            }
        }
    }
}