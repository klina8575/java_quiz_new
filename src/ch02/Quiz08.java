package ch02;

public class Quiz08 {
    public static void main(String[] args) {
        int v1 = 1;
        System.out.println("v1:" + v1);


        if(true) {
            int v2 = 2;
            if(true) {
                int v3 = 2;
                System.out.println("v1:" + v1);
                System.out.println("v2:" + v2);
                System.out.println("v3:" + v3);
            }


            System.out.println("v1:" + v1);
            System.out.println("v2:" + v2);
            //System.out.println("v3:" + v3); //내부블록에 있는 v3을 외부에서 사용할 수 X
        }


        System.out.println("v1:" + v1);
        //System.out.println("v2:" + v2); //내부블록에 있는 v2를 외부에서 사용할 수 X

    }
}
