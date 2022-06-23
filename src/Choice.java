public enum Choice {
    КАМЕНЬ(1), НОЖНИЦЫ(2), БУМАГА(3), НЕВЕРНЫЙ_ОБЪЕКТ(-1);

    private int choiceNum;

    Choice(int choiceNum) {
        this.choiceNum = choiceNum;
    }

    public static Choice valueOf(int userChoice) {
        for (Choice option : Choice.values()) {
            if (userChoice == option.choiceNum) {
                return option;
            }
        }
        return НЕВЕРНЫЙ_ОБЪЕКТ;
    }

    public boolean beats(Choice enemy) {
        if (choiceNum == 1 && enemy.choiceNum == 2) return true;
        else if (choiceNum == 2 && enemy.choiceNum == 3) return true;
        else if (choiceNum == 3 && enemy.choiceNum == 1) return true;
        else if (enemy.choiceNum == 1 && choiceNum == 2) return false;
        else if (enemy.choiceNum == 2 && choiceNum == 3) return false;
        else if (enemy.choiceNum == 3 && choiceNum == 1) return false;
        else return false;
    }


}
