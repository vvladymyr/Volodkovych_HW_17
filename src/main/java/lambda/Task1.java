package lambda;

public class Task1 {

    @FunctionalInterface
    interface CheckDivisibility {
        boolean check(int number);
    }
        public static void main(String[] args) {
            CheckDivisibility checkDivisibility = (number) -> number % 13 == 0;

            System.out.println(checkDivisibility.check(845));
            System.out.println(checkDivisibility.check(27));
        }
    }

