import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private Scanner scanner = new Scanner(System.in);

    private Random random = new Random();


    public int randomComputerChoice() {
        int randomNumber = random.nextInt(3) + 1;
        return randomNumber;
    }

    public boolean tie(Choice user, Choice comp) {
        if (user.equals(comp)) return true;
        else return false;
    }

    public void playerWillContinue() {
        System.out.println("Хотите сыграть еще ? [Да/Нет]");
        String playerWillContinue;
        playerWillContinue = scanner.nextLine();

        if (!(playerWillContinue.equals("Да"))) Field.playerWantsToPlay = false;
    }
}
