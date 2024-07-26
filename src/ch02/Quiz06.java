package ch02;

public class Quiz06 {
    public static void main(String[] args) {
        byte byteValue = 10;
        float floatValue = 2.5F;
        double doubleValue = 2.5;

        //byte result1 = byteValue + byteValue; //연산시 int타입으로 자동타입변환
        int result2 = 5 + byteValue; //자바에서는 정수 값(리터럴)은 int로 인식
        float result3 = 5 + floatValue; //자바에서는 정수 값(리터럴)은 int로 인식, float > int
        double result4 = 5 + doubleValue; //자바에서는 정수 값(리터럴)은 int로 인식, double > int


    }
}
