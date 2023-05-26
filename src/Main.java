import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int K = 5;

        while (K > 0) {
            System.out.println("A number is chosen"
                    + " between 1 to 100."
                    + "Guess the number"
                    + " within " + K + " trials.");
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("The number is less than " + guess);
                K--;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
                K--;
            } else {
                System.out.println("Correct Guess! Your Guess is " + guess + " and the random number is " + number);
            }
            if (K == 0){
                System.out.println("Game Over! You already guess 5 times! The randome number is " + number);
            }
        }
    }
}
