package org.example;

public class Main {
    public static void main(String[] args) {

        /**
         * comments
         *
         */

        System.out.println("First\tline");   //Надрукується кілька (як правило 4) пробіли
        System.out.println("Second\nline\nlines");  //Перехід на новий рядок
        System.out.println("3\'line");  //Символ одинарної лапки
        System.out.println("4\"line");  //символ подвійної лапки
        System.out.println("5\\line");  //Символ зворотної скісної риски
        System.out.println("Sum: " + sum(3,5));
    }

    public static int sum (int first, int second){
        return first + second;
    }
}
