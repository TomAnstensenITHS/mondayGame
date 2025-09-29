package Players;
public class NPC {
    private double winningNumber;

    public void generateNumber(){
        double n = Math.random();
        winningNumber = n;
        System.out.println(winningNumber);
    }
}
