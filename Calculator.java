public class Calculator {
   
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }

    public double sumOfArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public double varianceOfArray(double[] array) {
  

        return 0;  
    }

 
    public double standardDeviationOfArray(double[] array) {
       

        return 0; 
    }
}
