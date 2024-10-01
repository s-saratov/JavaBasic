package homework_07;

/*
Task 5*

Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

    - Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
    - Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
    - Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
    - Оценка 3 балла: огорчитесь и вычтите 30 минут.
    - Оценка меньше 3 баллов: запретите телевизор на сегодня.

Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        Random random = new Random();

        int score = random.nextInt(13);
        int tvTime = 45;

        System.out.println("Сегодня ребёнок принес оценку " + score + " за контрольную работу по математике.");

        switch (score) {
            case 12:
            case 11:
            case 10:
                System.out.println("Я говорю ребёнку, как я рад, и добавляю к оставшемуся времени 1 час.");
                tvTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Я хвалю ребёнка и добавляю 45 минут к оставшемуся времени.");
                tvTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Я отношусь нейтрально и добавляю 15 минут к оставшемуся времени.");
                tvTime += 15;
                break;
            case 3:
                System.out.println("Я огорчаюсь и вычитаю из оставшегося времени 30 минут.");
                tvTime -= 30;
                break;
            default:
                System.out.println("Я запрещаю ребёнку смотреть телевизор сегодня.");
                tvTime = 0;
                break;
        }

        // Из условия задачи не совсем понятно, можно ли увеличивать оставшееся время до 60 минут.
        // Если нельзя, то время следует делать равным оставшемуся на начало задачи, т.е. 45 минутам.

        if (tvTime > 60) tvTime = 60;

        System.out.println("\nОставшееся время для просмотра ребёнком ТВ составляет " + tvTime + " минут.");

    }

}