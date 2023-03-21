import java.util.Scanner;

public class Yrok3 {

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        int numberOfMonth = test.nextInt();

        switch (numberOfMonth) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Error");



        }
    }
}