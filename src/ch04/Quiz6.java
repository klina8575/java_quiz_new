package ch04;

public class Quiz6 {
    public static void main(String[] args) {
        //두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
       //1,1 1,2 1,3 1,4 1,5 1,6   2,1 2,2 2,3 2,4
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) System.out.println(i + ", " + j);
            }
        }

    }
}
