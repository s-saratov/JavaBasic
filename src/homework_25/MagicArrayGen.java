package homework_25;

/*
Task 1
Параметризовать наш класс "Magic Array", добавив в него обобщение типа (generic).

Реализовать в классе параметризованный интерфейс MyList (код интерфейса прикреплен к уроку)
 */

import java.util.Arrays;

public class MagicArrayGen<T> implements MyList<T> {

    // Поля класса

    private T[] array;
    private int cursor; // присвоено значение по умолчанию = 0;

    // Конструкторы объекта класса

    // 1. Создающий массив из 10 стандартных значений

    @SuppressWarnings("unchecked") // Подавляю предупреждение компилятора о непроверяемом приведении типа
    public MagicArrayGen() {
        array = (T[]) new Object[10];
    }

    // 2. Принимающий в себя обычный массив и создающий MagicArray с такими же значениями

    @SuppressWarnings("unchecked")
    public MagicArrayGen(T[] ordinaryArray) {
        if (ordinaryArray == null || ordinaryArray.length == 0) array = (T[]) new Object[10];
        else {
            array = Arrays.copyOf(ordinaryArray, ordinaryArray.length);
            cursor = ordinaryArray.length;
            expandArray();
        }
    }

    // Методы

    // 1. Добавляет в массив один элемент (входит в интерфейс MyList)

    @Override
    public void add (T value) {
        if (cursor == array.length - 1) expandArray();
        array[cursor] = value;
        cursor++;
    }

    // 2. Добавляет в массив несколько элементов (входит в интерфейс MyList)

    @Override
    public void addAll(T[] values) {
        for (T value : values) add(value);
    }

    // 3. Возвращает текущее количество элементов в массиве (входит в интерфейс MyList)

    @Override
    public int size() {
        return cursor;
    }

    // 4. Линейный поиск первого элемента в массиве с возвращением его индекса, если элемент найден,
    // либо - 1, если элемент не найден (входит в интерфейс MyList)

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    // 5. Линейный поиск последнего элемента в массиве с возвращением его индекса, если элемент найден,
    // либо - 1, если элемент не найден (входит в интерфейс MyList)

    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    // 6. Возвращает true, если массив содержит элемент с таким значением (входит в интерфейс MyList)

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    // 7. Возвращает представление элементов в виде массива (входит в интерфейс MyList)

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        T[] newArray = (T[]) new Object[cursor];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        return newArray;
    }

    // 8. Удаляет элемент по значению, возвращает true в случае успешного удаления (входит в интерфейс MyList)

    @Override
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) return false;
        else {
            remove(index);
            return true;
        }
    }

    // 9. Удаляет элемент по index, возвращает значение удалённого элемента (входит в интерфейс MyList)

    public T remove(int index) {
        if (index > 0 && index < cursor) {
            T tmp = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return tmp;
        }
        return null;
    }

    // 10. Возвращает true, если массив пустой (входит в интерфейс MyList)

    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    // 11. Возвращает значение по индексу (входит в интерфейс MyList)

    @Override
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }

    // 12. Перезаписывает значение по index (входит в интерфейс MyList)

    @Override
    public void set(int index, T value) {
        array[index] = value;
    }

    // 13. Выводит в консоль значения массива

    public void printArray () {
        System.out.print("[");
        for (int i = 0; i < cursor; i++) System.out.print(array[i] + ((i < cursor - 1) ? ", " : ""));
        System.out.print("]\n");
    }

    // 14. Динамическое расширение массива в два раза (служебный)

    @SuppressWarnings("unchecked")
    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < cursor; i++) newArray[i] = array[i];
        array = newArray;
    }

}