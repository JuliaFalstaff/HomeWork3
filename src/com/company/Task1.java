package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Попробуйте угадать число. У вас три попытки. ");

        int userAnswerToContinue; //объявляем переменную ответа пользователя на вопрос о продолжении игры

        do {
            gameOfGenerateNumber(); //запуск метода с игрой "Угадай число"
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userAnswerToContinue = scanner.nextInt(); //ответ пользователя на вопрос
        } while (userAnswerToContinue == 1);

        scanner.close();
        System.out.println("Игра окончена.");

    }


    public static void gameOfGenerateNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        int maxTry = 3; // фиксируем максимальное число попыток
        int userNumber;
        System.out.println("Введите число от 0 до 9: ");
        for (int countTry = 1; countTry <= maxTry; countTry++) {
            userNumber = scanner.nextInt(); // ответ пользователя
            if (userNumber < randomNumber && countTry < maxTry) {
                System.out.println("Вы ввели слишком маленькое число. Попробуйте еще раз.");
            } else if (userNumber > randomNumber && countTry < maxTry) {
                System.out.println("Вы ввели слишком большое число. Попробуйте еще раз.");
            } else if (countTry == maxTry) {
                System.out.println("Вы не угадали. У вас закончились попытки.");
            } else {
                System.out.println("Вы ввели число " + userNumber + ". Вы угадали. Подравляем!");
                break;
            }

        }
    }
}









