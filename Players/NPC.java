package Players;

import java.util.Random;

public class NPC {
    private int winningNumber;

    public void setWinningNumber(){
        Random rand = new Random();
        int n = rand.nextInt(100);
        winningNumber = n;
    }
    public int getWinningNumber() {
        return winningNumber;
    }
}
