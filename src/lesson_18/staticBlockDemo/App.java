package lesson_18.staticBlockDemo;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        System.out.println("counter: " + InitExample.counter);
        System.out.println(Arrays.toString(InitExample.colors));

        System.out.println("\n ======================== \n");

        InitExample initObject = new InitExample();

        System.out.println("\n ======================== \n");

        System.out.println(initObject.toString());

        System.out.println(Arrays.toString(InitExample.colors));

        System.out.println("\n ========= Second Object! ========= \n");

        InitExample initObject2 = new InitExample();

        System.out.println("\n ======================== \n");
        InitExample.changeColors("yellow", "purple");

        System.out.println(InitExample.colors);


    }

}