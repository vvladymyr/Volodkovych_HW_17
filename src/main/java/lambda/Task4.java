package lambda;

public class Task4 {
        public static void main(String[] args) {
            Task3.CalculateDiscriminant calculateOperationResult = (a, b, c) -> a * Math.pow(b, c);

            System.out.println(calculateOperationResult.calculate(2, 3, 4));
        }
    }

