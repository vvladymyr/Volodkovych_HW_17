package lambda;

public class Task2 {
    @FunctionalInterface
    interface CompareStrings {
        String compare(String str1, String str2);
    }
        public static void main(String[] args) {
            CompareStrings compareStrings = (str1, str2) -> {
                if (str1.length() >= str2.length()) {
                    return str1;
                } else {
                    return str2;
                }
            };
            System.out.println(compareStrings.compare("Abc", "Abcde"));
        }
    }

