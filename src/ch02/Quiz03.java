package ch02;

public class Quiz03 {
    public static void main(String[] args) {
        System.out.println("1" + "2"); //문자열 연산을 하므로
        System.out.println('A' + 'B'); // char타입은 연산시 int로 자동타입 변환, 65 + 66
        System.out.println('1' + 2); // char타입은 연산시 int로 자동타입 변환, 49 + 2
        System.out.println('1' + '2'); // char타입은 연산시 int로 자동타입 변환, 49 + 50
        System.out.println('J' + "ava"); // 문자열(String) + 다른 타입 = 항상 문자열(String)

    }
}
