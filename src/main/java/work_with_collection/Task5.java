package work_with_collection;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть набір чисел у вигляді одного рядка:");
            String input = scanner.nextLine();
            String[] numbers = input.split(",\\s*");
            Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));

            System.out.println("Результат без повторюваних елементів: " + String.join(", ", uniqueNumbers));
        }
    }

