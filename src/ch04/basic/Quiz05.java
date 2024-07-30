package ch04.basic;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = scanner.nextInt();

        System.out.println("입력받은 값: " + num);

        //힌트: % 연산자를 사용해 나머지 계산(2로 나누어 떨어진 값이 0이면 짝수), if ~ else문 이용

        if(num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}
