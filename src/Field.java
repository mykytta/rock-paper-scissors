import java.util.Scanner;

public class Field {
    private GameLogic gameLogic = new GameLogic();
    private Scanner scanner = new Scanner(System.in);
    static boolean playerWantsToPlay;

    Field() {
        start();
    }

    public void start() {

        System.out.println("Добро пожаловать в игру камень-ножницы-бумага");

        playerWantsToPlay = true;

        while (playerWantsToPlay) {
            System.out.println("    Пожалуйста выберите предмет    \n" +
                    "    1. Камень                      \n" +
                    "    2. Ножницы                     \n" +
                    "    3. Бумага                      \n");

            int playerOption = scanner.nextInt();

            Choice userChoice = Choice.valueOf(playerOption);

            Choice computerChoice = Choice.valueOf(gameLogic.randomComputerChoice());

            System.out.println("Вы выбрали: " + userChoice);
            System.out.println("Компьютер выбрал: " + computerChoice);

            if (userChoice.beats(computerChoice) && !gameLogic.tie(userChoice, computerChoice)) {
                System.out.println("Вы победили");
            } else if (gameLogic.tie(userChoice, computerChoice))
                System.out.println("Ничья");
            else
                System.out.println("К сожалению, вы проиграли");

            gameLogic.playerWillContinue();
        }

        scanner.close();
    }
}
