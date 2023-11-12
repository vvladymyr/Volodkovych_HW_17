package work_with_collection;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    static class Pet {
    }
    static class Cat extends Pet {
    }
    static class Dog extends Pet {
    }
    static class Parrot extends Pet {
    }
    public static class PetMapExample {
        public static void main(String[] args) {
            Map<String, Pet> petMap = new HashMap<>();

            petMap.put("Fluffy", new Cat());
            petMap.put("Buddy", new Dog());
            petMap.put("Polly", new Parrot());

            printKeys(petMap);
        }

        private static void printKeys(Map<String, Pet> map) {
            for (String key : map.keySet()) {
                System.out.println(key);
            }
        }
    }
}