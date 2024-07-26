package ch02;

public class Quiz11 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i; //int > byte 이므로 강제타입변환 필요
        ch = (char) b; // byte < char 이지만 음수부호 문제
        short s = (short) ch; // 음수부호 문제, 값의 범위도 다름
        i = (int) ch;

    }
}
