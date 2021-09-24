package Homework10;

import java.util.*;

public class Main {
    /**
     * Практическое задание
     * <p>
     * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * Посчитать, сколько раз встречается каждое слово.
     * <p>
     * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи,
     * а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
     * что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны.
     * Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
     * взаимодействие с пользователем через консоль и т.д).
     * Консоль использовать только для вывода результатов проверки телефонного справочника.
     */

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Cat", "Dog", "Dog", "chicken", "cow", "pig", "pig", "sheep", "cow", "horse", "goat", "rabbit", "Cat", "chicken", "Cat", "horse"));

        outputWords(words);
        outputUniqueWords(words);
        wordNumberOfRepetitions(words);
        System.out.println();


        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", 345345345);
        phonebook.add("Kuznetsov", 234566876);
        phonebook.print();
        phonebook.add("Ivanov", 786345345);
        phonebook.add("Kuznetsov", 674566876);
        phonebook.add("Petrov", 674566876);
        phonebook.print();
        System.out.println(phonebook.get("Petrov"));
    }


    static void outputWords (List < String > words) {

        System.out.println("Список слов:");

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

    static void outputUniqueWords (List < String > words) {

        System.out.println("Список уникальных слов: ");
        Set<String> words1 = new HashSet<>(words);

        for (String word : words1) {
            System.out.println(word);
        }
        System.out.println();
    }


    static void wordNumberOfRepetitions (List < String > words) {

        System.out.println("Количество повторений слов:");

        Map<String, Integer> wordNumberOfRepetitions = new HashMap<>();
        for (String word : words) {
            if (wordNumberOfRepetitions.containsKey(word))
                wordNumberOfRepetitions.put(word, wordNumberOfRepetitions.get(word) + 1);
            else{
                wordNumberOfRepetitions.put(word, 1);
            }
        }
        wordNumberOfRepetitions.entrySet().forEach(entry-> {
            System.out.print(entry.getKey() + " = ");
            System.out.println(entry.getValue());
        });
    }
}
