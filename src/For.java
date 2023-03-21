import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        int num = test.nextInt();

        int count = 0;


        for (int i = num; i > 0;i--) {
            count += 1;
            System.out.printf("Счётчик: %d, Кол-во: %d\n", i, count);
        }
    }
}