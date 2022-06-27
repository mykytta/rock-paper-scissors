package com.mykyta.rps;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final Field field = new Field();


    public void start() {
        Choice userInput = getUserChoice();
        Choice pcInput = randomComputerChoice();
        this.field.setC1(userInput);
        this.field.setC2(pcInput);
        System.out.println(this.field);
        System.out.println(checkWinner());
        playerWillContinue();
    }

    private String checkWinner() {
        if (field.getC1().equals(field.getC2())) return "Ничья";
        else if (field.getC1().getChoiceNum() == 1 && field.getC2().getChoiceNum() == 2) return "Вы выиграли";
        else if (field.getC1().getChoiceNum() == 2 && field.getC2().getChoiceNum() == 3) return "Вы выиграли";
        else if (field.getC1().getChoiceNum() == 3 && field.getC2().getChoiceNum() == 1) return "Вы выиграли";
        else if (field.getC2().getChoiceNum() == 1 && field.getC1().getChoiceNum() == 2) return "Вы проиграли";
        else if (field.getC2().getChoiceNum() == 2 && field.getC1().getChoiceNum() == 3) return "Вы проиграли";
        else
            return "Вы проиграли";
    }

    private Choice getUserChoice() {
        System.out.println("    Пожалуйста выберите предмет    \n" +
                "               1. Камень                      \n" +
                "               2. Ножницы                     \n" +
                "               3. Бумага                      \n");
        int c = scanner.nextInt();
        return Choice.valueOf(c);
    }

    private Choice randomComputerChoice() {
        int randomNumber = random.nextInt(3) + 1;
        return Choice.valueOf(randomNumber);
    }

    private void playerWillContinue() {
        System.out.println("Хотите сыграть еще ? [Да/Нет]");
        String playerWillContinue = scanner.next();

        if (playerWillContinue.toUpperCase().equals("ДА")) {
            start();
        } else {
            System.out.println("Спасибо за игру!");
        }
    }

}
