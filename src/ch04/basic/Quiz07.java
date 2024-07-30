package ch04.basic;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("신장 입력: ");
        int height = scanner1.nextInt();

        if(height >= 150) {
            System.out.println("놀이기구 이용가능");
        } else { //신장이 150미만
            System.out.print("부모님하고 함께 왔나요?");
            String yn = scanner2.nextLine();

            if(yn.equals("y")) {
                System.out.println("좋은 시간 보내렴~~");
            } else {
                System.out.println("어른하고 다시 오렴~");
            }
        }
    }
}
