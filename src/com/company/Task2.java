package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int r = rand.nextInt(words.length);
        System.out.println(words[r]); // вывести загаданное слово для нашей проверки кода
        String guessWord = words[r];
        String hideLengthOfWord = "#############";
        String userAnswer;

        //Условие задачи для пользователя:
        System.out.println("Компьютер загадал одно слово из списка: \"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\",\n" +
                "                \"broccoli\", \"carrot\", \"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\",\n" +
                "                \"kiwi\", \"mango\", \"mushroom\", \"nut\", \"olive\", \"pea\", \"peanut\", \"pear\",\n" +
                "                \"pepper\", \"pineapple\", \"pumpkin\", \"potato\".");



        do {
            System.out.println("Отгадайте слово. Введите ответ:");
            userAnswer = scanner.next();
            System.out.println("Ваш ответ: " + userAnswer);
            String generateAnswer = "";

            for (int i = 0; i < userAnswer.length(); i++) {
                char a = userAnswer.charAt(i);
                char b = guessWord.charAt(i);
                if (a == b) {
                    generateAnswer += a;
                } else if (a > b) {
                    break;
                }
            }
            System.out.println("Вы успешно угадали следующие буквы: " + generateAnswer + hideLengthOfWord);

            if (userAnswer.equals(guessWord)) {
                System.out.println("Поздравляем, вы угадали! Ваш ответ " + userAnswer + " - верный!");
            }

        } while (!userAnswer.equals(guessWord));

        }



    }





