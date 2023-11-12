package work_with_collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Task10 {
    public static class AddToStartOfListExample {
        public static void main(String[] args) {
            List<String> strings = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість рядків: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Введіть рядок: ");
                strings.add(0, scanner.nextLine());
            }

            for (String str : strings) {
                System.out.println(str);
            }
        }
    }
}
