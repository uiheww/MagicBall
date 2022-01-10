package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задайте вопрос, и получите ответ.");
        String privetstvie [] = {"Привет, дорогой друг. Сегодня для тебя такой ответ: " , "Кто вопрошает, тот получит ответ: ", "Здравствуй, смертный. Вот ответ на твой вопрос: " };
        String otvet [] =  {"да", "нет", "возможно", "шансы хорошие", "спросите снова", "без сомнений", "есть сомнения", "непонятно", "не могу сказать", "духи говорят нет", "духи говорят да", "очень вероятно"};
        String question;
        question = scanner.next();
        int index = random.nextInt(otvet.length);
        int index2 = random.nextInt(privetstvie.length);
        System.out.println(privetstvie[index2] + otvet[index]);

    }

}
