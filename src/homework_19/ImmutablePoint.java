package homework_19;

/*
Task 3
Неизменяемый объект

Создайте класс ImmutablePoint:
- объявите final поля x и y типа int;
- инициализируйте их через конструктор;
- попытайтесь создать методы-сеттеры для изменения значений x и y;
- объясните, почему значения полей не могут быть изменены после создания объекта.
 */

public class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public void setX (int x) {
//        this.x = x;
//    }
//
//    public void setY (int y) {
//        this.y = y;
//    }

    // При попытке раскомментировать строку выше компилятор выдаст ошибки:
    // 1. "Cannot assign a value to final variable 'x'"
    // 2. "Cannot assign a value to final variable 'y'"

        /*
        Объяснение

        К переменным x и y типа int применено ключевое слово final. Для переменных примитивного типа это означает,
        что однажды присвоенное значение не может быть изменено.

        В нашем случае присвоение значений происходит при создании экземпляра класса при помощи конструктора.
        Соответственно, до создания экземпляра класса не существует самих переменных, а после его создания
        менять значения уже невозможно. Соответственно, возможные сценарии использования сеттеров отсутствуют.

         */

}