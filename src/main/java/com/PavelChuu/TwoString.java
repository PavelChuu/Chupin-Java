package com.PavelChuu;
import java.util.Scanner;

public class TwoString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для переменной a: ");
        String a = scanner.nextLine();
        System.out.print("Введите строку для переменной b: ");
        String b = scanner.nextLine();

        if (a.equals(b))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}
