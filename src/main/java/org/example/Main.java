package org.example;

// Klavyeden girilen Gray kodundaki tamsayıyı, 2 tabanıns dönüştüren program.
// örn. 1110 ---> 1011

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, i;
        String g;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n    Gray Kodunda Sayı : ");
        g = scanner.nextLine();
        a = (int) (g.charAt(0) - 48);
        System.out.printf("\n   Tabanındaki Karşılığı : %d", a);

        for (i = 1; i < g.length(); i++) {
            a = a ^ ((int) g.charAt(i) - 48);
            System.out.printf("%d", a);
        }
    }
}