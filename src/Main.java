import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Continue = "y";
        while (Continue.equals("y")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 100");
            int num = input.nextInt();
            input.nextLine();
            if ((num % 2 == 1) && (num > 60) && (num < 100)) {
                System.out.println(num + " Odd and over 60.");
            } else if ((num % 2 == 1) && (num > 0) && (num < 60))  {
                System.out.println(num + " and Odd");
            } else if ((num % 2 == 0) && (num > 60) && (num <= 100)) {
                System.out.println(num + " Even");
            } else if ((num % 2 == 0) && (num >= 26) && (num <= 60)) {
                System.out.println("Even");
            } else if ((num % 2 == 0) && (num >= 2) && (num <= 25)) {
                System.out.println("Even and less than 25");
            }
            System.out.println("Continue? (y/n)");
            Continue = input.nextLine();
        }
    }
}