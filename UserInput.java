import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    // Function to get a double input from the user
    public double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to get an array of doubles from the user
    public double[] getDoubleArrayInput(String prompt) {
        System.out.print(prompt);
        String[] strNumbers = scanner.nextLine().split("\\s+");
        double[] numbers = new double[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Double.parseDouble(strNumbers[i]);
        }

        return numbers;
    }
}
