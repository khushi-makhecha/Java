import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        while (n > 0) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            boolean modThree = number % 3 == 0;
            boolean modFive = number % 5 == 0;
            int value = (modThree && modFive) ? 2 : ((modThree || modFive) ? 1 : 0);
            switch (value) {
                case (2):
                    System.out.println("FizzBuzz");
                    break;
                case (1):
                    if (modThree)
                        System.out.println("Buzz");
                    else
                        System.out.println("Fizz");
                    break;
                default:
                    System.out.println(number);
            }
            n--;
        }
    }
}