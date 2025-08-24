package com.PavelChuu;
import java.util.Scanner;

public class TwoString {
    public static void main(String[] args){
        String a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для переменной a: ");
        a = scanner.nextLine();
        //Проверяем что строка не пустая. Если она пустая, запрашиваем повторный ввод.
            while (a.isEmpty()) {
                System.out.print("Строка пустая. Введите строку для переменной a:");
                a = scanner.nextLine();
            }

        System.out.print("Введите строку для переменной b: ");
        b = scanner.nextLine();
        //Проверяем что строка не пустая. Если она пустая, запрашиваем повторный ввод.
            while (b.isEmpty()) {
                System.out.print("Строка пустая. Введите строку для переменной b:");
                b = scanner.nextLine();
            }
        //Сравниваем строки
        if (a.equals(b))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}
