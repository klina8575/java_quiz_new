package ch03;

public class Quiz12 {
    public static void main(String[] args) {
        //다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만
        // 변수 b의 값이 true가 되도록 하는 코드이다. 물음표(?)에 알맞은 코드를 넣으시오.
        char ch = 'A'; //65

        //소문자 이거나 대문자 이거나 숫자인지 판단
        //a: 97, x: 122                          //A: 65, Z: 90              //0: 48, 9: 57
        boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
        System.out.println(b);

    }
}
