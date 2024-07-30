package ch04;

public class Quiz7 {
    public static void main(String[] args) {
        //1,1,2,3,5,8,13,21,...
        int num1 = 1; //첫번째 값
        int num2 = 1; //두번째 값
        int num3 = 0; //세번째 값

        //10번째 수열의 값
        System.out.print(num1 + ", " + num2);

        for (int i=0; i<8; i++) { //이미 위에서 수열의 첫번째, 두번째 값을 출력했으므로 8번만 반복을 하면된다.
            num3 = num1 + num2; //세번째 값을 만든다
            System.out.print(", " + num3);
            num1 = num2; //두번째 수열을 첫번째 값으로 만든다.
            num2 = num3; //세번째 수열을 두번째 값으로 만든다.
        }
    }
}
