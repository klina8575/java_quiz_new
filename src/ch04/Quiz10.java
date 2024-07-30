package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; //통장잔고
        boolean run = true; //실행상태

        while (run) {
            System.out.println("-----------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------");
            System.out.print("선택> ");

            //사용자로부터 입력을 받는다.
            String menuNum = scanner.next();
            //String menuNum = scanner.nextLine(); 개행문자열까지 입력받아서 문제 발생


            switch (menuNum) {
                case "1" :
                    System.out.print("예금액> ");
                    balance += scanner.nextInt(); //통잔잔고에 기존에 예금했던 돈을 유지하기 위해 누적 합산
                    break;
                case "2" :
                    System.out.print("출금액> ");
                    balance -= scanner.nextInt();
                    break;
                case "3" :
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;
                case "4" :
                    run = false;
                    break;
            }
        }

        System.out.println("프로그램 종료");

    }
}
