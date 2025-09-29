import Players.*;
import java.util.Scanner;

public class Game {

    public void runGame() {
        setup();
        introduction();
        takeAGuess();
        compareGuess();
        outro();
    }
    public void setup() {
        NPC npc = new NPC();
        Player player = new Player();
        Scanner sc = new Scanner(System.in);
        npc.setWinningNumber();
    }

    public void introduction(){

    }
    public void takeAGuess(){
        System.out.print("Please guess a number between 0 and 100: ");
        int input = scan.nextInt();
        player.setGuess();
    }
    public void compareGuess(){

    }
    public void outro(){

    }
}
