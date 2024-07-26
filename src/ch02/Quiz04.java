package ch02;

public class Quiz04 {
    public static void main(String[] args) {
        byte byteValue = 10;
        char charValue = 'A';

        int intValue = byteValue;
        int intValue2 = charValue;
        //short shortValue = charValue;
        //char ch = shortValue;

        //short(-32,768 ~ 32,767) char(0 ~ 65535)
        //값의 범위가 달라서 둘다 값의 손실이 일어날 수 있으므로 자동타입 변환 X
        //음수부호 문제도 존재(char는 양수값만 존재)

        double doubleValue = byteValue;


    }
}
