package homew3;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }
    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
    private static void task2() {
        Phonebook phonebook = new Phonebook();

        phonebook.add("antonyan", "8999123321");
        phonebook.add("antonyan", "8912155326");
        phonebook.add("bobov", "8917155552");
        phonebook.add("bobov", "8913455672");
        phonebook.add("antonyan", "899999999");
        phonebook.add("igoryan", "899111111");
        phonebook.add("bobov", "89923231999");
        phonebook.add("smetanov", "8888123113");
        phonebook.add("igoryan", "8324325234");

        System.out.println(phonebook.get("antonyan"));
        System.out.println(phonebook.get("igoryan"));
        System.out.println(phonebook.get("bobov"));
        System.out.println(phonebook.get("smetanov"));
    }
}