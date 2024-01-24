/*
 * Name: Riyaan Chatterjee
 * PRN: 23070126507
 * Batch: 2022-26
 */

 public class Main {
    public static void main(String[] args) {
        

        
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        
        double num1 = userInput.getDoubleInput("Enter the first number: ");
        double num2 = userInput.getDoubleInput("Enter the second number: ");

     
        double sum = calculator.addition(num1, num2);
        double difference = calculator.subtraction(num1, num2);
        double product = calculator.multiplication(num1, num2);
        double quotient = calculator.division(num1, num2);

        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        
        double[] numbersArray = userInput.getDoubleArrayInput("Enter numbers separated by spaces: ");

        double arraySum = calculator.sumOfArray(numbersArray);
        double arrayVariance = calculator.varianceOfArray(numbersArray);
        double arrayStdDeviation = calculator.standardDeviationOfArray(numbersArray);

        
        System.out.println("Array Sum: " + arraySum);
        System.out.println("Array Variance: " + arrayVariance);
        System.out.println("Array Standard Deviation: " + arrayStdDeviation);
    }
}
