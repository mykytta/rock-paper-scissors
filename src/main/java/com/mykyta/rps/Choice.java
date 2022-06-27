package com.mykyta.rps;

public enum Choice {
    КАМЕНЬ(1), НОЖНИЦЫ(2), БУМАГА(3), НЕВЕРНЫЙ_ОБЪЕКТ(-1);

    private int choiceNum;

    Choice(int choiceNum) {
        this.choiceNum = choiceNum;
    }

    public int getChoiceNum() {
        return choiceNum;
    }

    public static Choice valueOf(int userChoice) {
        for (Choice option : Choice.values()) {
            if (userChoice == option.choiceNum) {
                return option;
            }
        }
        return НЕВЕРНЫЙ_ОБЪЕКТ;
    }




}
