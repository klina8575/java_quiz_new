package ch04.basic;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = scanner.nextInt();

        String result = num > 0 ? "양수" : ((num == 0) ? "0" : "음수");
        System.out.println(result);

        /*
        if(num > 0) {
            System.out.println("양수");
        } else {
            if(num == 0) {
                System.out.println("0");
            } else {
                System.out.println("음수");
            }
        }
        */


/*        if(num > 0) {
            System.out.println("양수");
        } else if(num < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }*/
    }
}
