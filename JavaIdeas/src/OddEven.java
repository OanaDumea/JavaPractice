import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class OddEven {
    public static void main(String[] args) {

        int number1, result;
        String choice = null, oddEven, guess;
        boolean done = false;

        Scanner input = new Scanner(System.in);

        Random Generator = new Random();

        while (!done) {
            System.out.println("Please choose an option");
            System.out.println("Odd or Even (Case Sensitive)");
            choice = input.nextLine();

            if (choice.equals("Even") || choice.equals("Odd")) {
                done = true;
            } else {
                System.out.println("Please enter 'Even' or 'Odd'");
            }
        }
        System.out.println("Please enter a number");
        number1 = input.nextInt();

        result = number1 + Generator.nextInt(11);

        if (result % 2 == 0) {
            oddEven = "Even";
        }else{
                oddEven = "Odd";
            }
        if (oddEven.equals(choice)) {
            guess = "Correct";
        }else{
                    guess = "Incorrect";
        }

        System.out.println("\nGenerating: '" + number1 + "' + 'random number'...");
        System.out.println("\nThe random number generated is: " + (result - number1));
        System.out.println("\nThe result is: " + result);
        System.out.println("\nYour choice was: " + choice);
        System.out.println("The result was: " + oddEven);
        System.out.println("Your choice was " + guess);
    }
}



