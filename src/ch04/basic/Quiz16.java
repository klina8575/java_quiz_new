package ch04.basic;

import java.util.Scanner;

public class Quiz16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수입력: ");
        int num = scanner.nextInt();

        int factor = 1;
        for (int i=1; i<=num; i++) {
            factor *= i;
        }

        System.out.println(factor);
    }
}
