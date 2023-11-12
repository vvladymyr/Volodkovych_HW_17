package work_with_collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task9 {
    public static class LongestStringExample {
        public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість рядків: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Введіть рядок: ");
                strings.add(scanner.nextLine());
            }

            findAndPrintLongestString(strings);
        }

        private static void findAndPrintLongestString(List<String> strings) {
            int maxLength = 0;
            List<String> longestStrings = new ArrayList<>();

            for (String str : strings) {
                int currentLength = str.length();

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestStrings.clear();
                    longestStrings.add(str);
                } else if (currentLength == maxLength) {
                    longestStrings.add(str);
                }
            }

            System.out.println("Найдовший(і) рядок(и):");
            for (String longestStr : longestStrings) {
                System.out.println(longestStr);
            }
        }
    }
}
