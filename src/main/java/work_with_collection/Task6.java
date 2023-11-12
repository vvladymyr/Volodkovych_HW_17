package work_with_collection;
import java.util.HashMap;
import java.util.Map;

public class Task6 {

    class Toy {
        private String name;
        private double price;

        public Toy(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put("Tony", new Task6().new Toy("Tony", 10.99));
        toyMap.put("Sindy", new Task6().new Toy("Sindy", 20.50));
        toyMap.put("Bob", new Task6().new Toy("Bob", 45.99));

        printEntrySet(toyMap);
        printKeySet(toyMap);
        printValues(toyMap);
    }

    private static void printEntrySet(Map<String, Toy> map) {
        System.out.println("Printing entrySet:");
        for (Map.Entry<String, Toy> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getName() + " - $" + entry.getValue().getPrice());
        }
        System.out.println();
    }

    private static void printKeySet(Map<String, Toy> map) {
        System.out.println("Printing keySet:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }

    private static void printValues(Map<String, Toy> map) {
        System.out.println("Printing values:");
        for (Toy toy : map.values()) {
            System.out.println(toy.getName() + " - $" + toy.getPrice());
        }
    }
}