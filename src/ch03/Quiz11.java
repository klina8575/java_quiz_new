package ch03;

public class Quiz11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b); //byte끼리 연산시에 int형이 되므로 강제 타입변환

        char ch = 'A'; //65, C는 67
        ch = (char) (ch + 2);

        float f = 3 / 2.0f; //정수 연산의 결과는 정수
        long l = 3000 * 3000 * 3000L; //허용범위가 큰 long타입으로 바뀐다
        float f2 = 0.1f;

        double d = 0.1;
        boolean result = (float) d==f2; //비교연산시 반드시 실수의 타입을 맞춰야한다

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);

        //실행결과
        //c=30
        //ch=C
        //f=1.5
        //l=27000000000
        //result=true


    }
}
