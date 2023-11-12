package work_with_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task8 {
    public static class DuplicateRemovalExample {
        public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
            return new HashSet<>(collection);
        }
        public static void main(String[] args) {
            String inputString = "1, 2, 3, 4, 4, 5";
            List<String> distinctStrings = Arrays.asList(inputString.split(", "));
            Set<String> result1 = new HashSet<>(removeDuplicates(distinctStrings));
            System.out.println(String.join(", ", result1));

            List<String> toyNames = Arrays.asList("Teddy Bear", "Legos", "Doll", "Teddy Bear");
            Set<String> result2 = new HashSet<>(removeDuplicates(toyNames));
            System.out.println(result2);

            Map<String, Task7.Pet> petsMap = new HashMap<>();
            petsMap.put("Fluffy", new Task7.Cat());
            petsMap.put("Buddy", new Task7.Dog());
            petsMap.put("Fluffy", new Task7.Parrot());
            Set<String> result3 = new HashSet<>(removeDuplicates(petsMap.keySet()));
            System.out.println(result3);
        }
    }
}