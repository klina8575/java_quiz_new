package ch02;

public class Quiz05 {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue; //double(실수)이 int(실수)보다 허용범위가 더 크므로 강제타입 변환을 해도 되고 안해도 됨
        byte var2 = (byte) intValue; //int > byte 이므로 강제타입 변환
        int var3 = (int) doubleValue; // double > int 이므로 강제타입 변환
        //char var4 = (char) strValue;
        //String은 참조타입이고 char는 기본타입이므로 출신자체가 다르다.
        //기본타입은 기본타입끼리 강제타입변환 가능


    }
}
