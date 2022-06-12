import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        String choice;
        int number1, number2, result;
        boolean done = false;

        Scanner scanner = new Scanner(System.in);


        while (!done) {
            System.out.println("Input number1");
            number1 = scanner.nextInt();
            System.out.println("Choose an operator");
            operator = scanner.next().charAt(0);
            System.out.println("Input number2");
            number2 = scanner.nextInt();
            //while (true){
            //System.out.println("Exit? (x exits)");
            String input = scanner.nextLine();
            switch (operator) {
                case '+' -> {
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                case '-' -> {
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                }
                case '/' -> {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                }
                case '*' -> {
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                }
                default -> System.out.println("Invalid operator");
            }
            System.out.println("\nDo you want to continue? y/x: ");

            choice = String.valueOf(scanner.next().charAt(0));
            if (choice.equals("x")){
                System.out.println("Exiting Program...");
                done = true;
            } else if (choice.equals("y")) {
                System.out.println();
                done = false;
            } else{
                System.out.println("\nInput not recognised");
                break;
            }
        }
    }
}
