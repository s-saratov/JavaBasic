package lesson_44.consultation;

// Консультация 12.11.2024
// Для домашнего задания

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(16, 25, 38, -555, 42, 91, 1117));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        };

        Comparator<Integer> callable = (i1, i2) -> {
            return i1 - i2;
        };

        Comparator<Integer> comparator1 = (i1,  i2) -> i1 - i2;

        integers.sort((i1, i2) -> i1 % 10 - i2 % 10);

        System.out.println(integers);

        int x = 1116;

        int lst = x % 10;

    }

}