package ch03;

public class Quiz13 {
    public static void main(String[] args) {
        //다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
        //인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
        //들어 'A'의 코드는 65이고 'a'의 코드는 97이다. (  )에 삼항연산자를 이용해 알맞은 코드를 넣으시오.
        char ch = 'F';
        char lowerCase = ('A' <= ch && ch <= 'Z')? (char)(ch + 32): ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);


    }
}
