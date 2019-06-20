package Lesson3;

import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся):
 * а) Посчитать сколько раз встречается каждое слово;
 * б) Найти список уникальных слов, из которых состоит массив (дубликаты не считаем);
 * <p>
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
 * телефонных номеров. В этот телефонный справочник с помощью метода add() можно
 * добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует
 * учесть, что под одной фамилией может быть несколько телефонов (в случае
 * однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 *
 * @author Anatoly Yakovlev
 */

public class HW3 {
    public static void main(String[] args) {
        String[] words = {"book", "cat", "dog", "book", "duck", "lock", "fork", "duck", "golf", "lock"};

        // Task 1.a
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // subtask 1.b.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get("Petrov"));
    }
}
