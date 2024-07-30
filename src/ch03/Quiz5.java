package ch03;

public class Quiz5 {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

// ➊ (lengthTop+lengthBottom) * height / 2.0
//➋ (lengthTop+lengthBottom) * height * 1.0 / 2
//➌ (double)(lengthTop+lengthBottom) * height / 2
//➍ (double)( (lengthTop+lengthBottom) * height / 2)

        double area = (double)((lengthTop+lengthBottom) * height / 2);
        System.out.println(area);

    }
}
