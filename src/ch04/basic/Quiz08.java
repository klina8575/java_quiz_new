package ch04.basic;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산자 입력하세요(+, -, *, /): ");
        String operator = scanner.nextLine();

        //default가 실행이 되면 result에 값이 들어간다는 보장이 없으므로 반드시 0으로 값 초기화
        int result = 0;

        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                if (num2 != 0) { //0으로 나눌 수 없으므로 0이 아닐때만 나눗셈 실행
                   result = num1 / num2;
                } else { //num2가 0일때
                    System.err.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.err.println("유효하지 않은 연산자 입니다.");
        }

        System.out.println("결과: " + result);

    }

}

