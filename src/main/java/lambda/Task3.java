package lambda;

public class Task3 {
    @FunctionalInterface
    interface CalculateDiscriminant {
        double calculate(double a, double b, double c);
    }
        public static void main(String[] args) {
            CalculateDiscriminant calculateDiscriminant = (a, b, c) -> b * b - 4 * a * c;

            System.out.println(calculateDiscriminant.calculate(1.5, -3, 2));

        }
    }

