import java.util.Random;

public class OpponentLogic {
    Random random = new Random();
    int botInput;
    public void getBotInputs() {
        botInput = random.nextInt(8) + 1;
    }
}
