package testYantra;

public class DivisibleBy3 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100 divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
