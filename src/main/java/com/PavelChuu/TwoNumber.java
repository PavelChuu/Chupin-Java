package com.PavelChuu;

import java.util.Scanner;

public class TwoNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("Введите целое число для переменной a: ");
        //Проверяем ввод числа. Если оно не целое просим повторный ввод
        while (!scanner.hasNextInt()) {
            System.out.print("Неверный ввод. Введите целое число для переменной a:");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.print("Введите целое число для переменной b: ");
        //Проверяем ввод числа. Если оно не целое просим повторный ввод
        while (!scanner.hasNextInt()) {
            System.out.print("Неверный ввод. Введите целое число для переменной b:");
            scanner.next();
        }
        b = scanner.nextInt();

        //Проводим операции над числами
        if (a == b)
            System.out.println("a = b");
        else if (a > b)
            System.out.println("a > b");
        else
            System.out.println("a < b");

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + a * b);

        if ( b == 0 )
            System.out.println("Деление на 0 не возможно");
        else System.out.println(a + "/" + b + "=" + ((float)a / b));
        }
    }