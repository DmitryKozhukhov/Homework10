package Homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, List<Integer>> phonebook = new HashMap<>();
    private List<Integer> newNumber = new ArrayList<>();

    public  void add(String Key, Integer Value) {

        if (phonebook.containsKey(Key)) {
            newNumber = phonebook.get(Key);
            newNumber.add(Value);
            phonebook.put(Key, newNumber);
        } else {
            newNumber = new ArrayList<>();
            newNumber.add(Value);
            phonebook.put(Key, newNumber);
        }
    }

    public void print(){
        phonebook.entrySet().forEach(entry -> {
            System.out.print(entry.getKey() + " = ");
            System.out.println(entry.getValue());
        });  System.out.println();
    }

    public List<Integer> get(String name) {
        return phonebook.get(name);
    }

}
