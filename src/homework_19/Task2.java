package homework_19;

/*
Task 2
Неизменяемая переменная:
    - объявите переменную final int MAX_USERS = 100;
    - попробуйте изменить значение MAX_USERS в коде после её инициализации;
    - объясните, что произошло при попытке изменения значения.
 */

public class Task2 {

    public static void main(String[] args) {

        final int MAX_USERS = 100;

//        MAX_USERS = 150;
        // При попытке раскомментировать строку выше компилятор выдаст ошибку:
        // "Cannot assign a value to final variable 'MAX_USERS'"

        /*
        Объяснение

        К переменной MAX_USERS типа int применено ключевое слово final. Для переменных примитивного типа это означает,
        что однажды присвоенное значение не может быть изменено.
         */


    }

}