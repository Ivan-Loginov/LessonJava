import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();

         if (numberOfMonth == 12 || numberOfMonth  == 1 ||  numberOfMonth  == 2){
         System.out.println("Зима");}
         else if(numberOfMonth == 3 || numberOfMonth  == 4 ||  numberOfMonth  == 5){
         System.out.println("Весна");}
         else if (numberOfMonth == 6 || numberOfMonth  == 7 ||  numberOfMonth  == 8){
         System.out.println("Лето");}
         else if (numberOfMonth == 9 || numberOfMonth  == 10 ||  numberOfMonth  == 11){
         System.out.println("Осень");} else {System.out.println("ERROR");}


    }
    }
