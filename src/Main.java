public class Main {

    static ConsoleOutput consoleOutput = new ConsoleOutput();
    static int frstTurn;
    static int scndTurn;
    static int thrdTurn;
    static int frthTurn;
    static int fivtTurn;
    static int sixtTurn;
    static int sevtTurn;
    static int eigtTurn;
    static int nintTurn;

    static boolean userWon = false;
    static boolean botWon = false;

    public static void logicIfUserWon() {
        //IF USER WON HORIZONTALLY FIRST COLUMN
        if (consoleOutput.arr[0][0].matches(consoleOutput.x) && consoleOutput.arr[0][1].matches(consoleOutput.x) && consoleOutput.arr[0][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON HORIZONTALLY SCND COLUMN
        else if (consoleOutput.arr[1][0].matches(consoleOutput.x) && consoleOutput.arr[1][1].matches(consoleOutput.x) && consoleOutput.arr[1][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON HORIZONTALLY THRD COLUMN
        else if (consoleOutput.arr[2][0].matches(consoleOutput.x) && consoleOutput.arr[2][1].matches(consoleOutput.x) && consoleOutput.arr[2][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON VERTICALLY FIRST ROW
        else if (consoleOutput.arr[0][0].matches(consoleOutput.x) && consoleOutput.arr[1][0].matches(consoleOutput.x) && consoleOutput.arr[2][0].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON VERTICALLY SCND ROW
        else if (consoleOutput.arr[0][1].matches(consoleOutput.x) && consoleOutput.arr[1][1].matches(consoleOutput.x) && consoleOutput.arr[2][1].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON VERTICALLY THRD ROW
        else if (consoleOutput.arr[0][2].matches(consoleOutput.x) && consoleOutput.arr[1][2].matches(consoleOutput.x) && consoleOutput.arr[2][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON DIAGONALLY 1 TO 9
        else if (consoleOutput.arr[0][0].matches(consoleOutput.x) && consoleOutput.arr[1][1].matches(consoleOutput.x) && consoleOutput.arr[2][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
        //IF USER WON VERTICALLY 7 TO 3
        else if (consoleOutput.arr[2][0].matches(consoleOutput.x) && consoleOutput.arr[1][1].matches(consoleOutput.x) && consoleOutput.arr[0][2].matches(consoleOutput.x)) {
            userWon = true;
            System.out.println("\n🔴 Player Won 🔴\n");
        }
    }

    public static void logicIfBotWon() {
        //IF USER WON HORIZONTALLY FIRST COLUMN
        if (consoleOutput.arr[0][0].matches(consoleOutput.o) && consoleOutput.arr[0][1].matches(consoleOutput.o) && consoleOutput.arr[0][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON HORIZONTALLY SCND COLUMN
        else if (consoleOutput.arr[1][0].matches(consoleOutput.o) && consoleOutput.arr[1][1].matches(consoleOutput.o) && consoleOutput.arr[1][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON HORIZONTALLY THRD COLUMN
        else if (consoleOutput.arr[2][0].matches(consoleOutput.o) && consoleOutput.arr[2][1].matches(consoleOutput.o) && consoleOutput.arr[2][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON VERTICALLY FIRST ROW
        else if (consoleOutput.arr[0][0].matches(consoleOutput.o) && consoleOutput.arr[1][0].matches(consoleOutput.o) && consoleOutput.arr[2][0].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON VERTICALLY SCND ROW
        else if (consoleOutput.arr[0][1].matches(consoleOutput.o) && consoleOutput.arr[1][1].matches(consoleOutput.o) && consoleOutput.arr[2][1].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON VERTICALLY THRD ROW
        else if (consoleOutput.arr[0][2].matches(consoleOutput.o) && consoleOutput.arr[1][2].matches(consoleOutput.o) && consoleOutput.arr[2][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON DIAGONALLY 1 TO 9
        else if (consoleOutput.arr[0][0].matches(consoleOutput.o) && consoleOutput.arr[1][1].matches(consoleOutput.o) && consoleOutput.arr[2][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
        //IF USER WON VERTICALLY 7 TO 3
        else if (consoleOutput.arr[2][0].matches(consoleOutput.o) && consoleOutput.arr[1][1].matches(consoleOutput.o) && consoleOutput.arr[0][2].matches(consoleOutput.o)) {
            botWon = true;
            System.out.println("\n🔴 Bot Won 🔴\n");
        }
    }
    public static void main(String[] args) {
        OpponentLogic opponentLogic = new OpponentLogic();
        consoleOutput.outputInConsole();
        UserInputs userInputs = new UserInputs();

        //first Turn
        userInputs.getUserInputs();
        frstTurn = userInputs.userInputSlot;
        System.out.print("User's turn!");
        consoleOutput.UserInputsToOutput(userInputs.userInputSlot);

        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //second Turn
        opponentLogic.getBotInputs();
        scndTurn = opponentLogic.botInput;
        while (opponentLogic.botInput == userInputs.userInputSlot) {
            opponentLogic.getBotInputs();
        }
        System.out.print("Computer's turn!");
        consoleOutput.BotInputsToOutput(opponentLogic.botInput);

        //third Turn
        userInputs.getUserInputs();
        thrdTurn = userInputs.userInputSlot;
        if (thrdTurn == frstTurn || thrdTurn == scndTurn) {
            System.out.println("This slot is already occupied! Pick another that is not " + frstTurn + " or " + scndTurn);
            userInputs.getUserInputs();
            thrdTurn = userInputs.userInputSlot;
        }
        System.out.print("User's turn!");
        consoleOutput.UserInputsToOutput(userInputs.userInputSlot);

        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //fourth Turn
        opponentLogic.getBotInputs();
        frthTurn = opponentLogic.botInput;
        while (frthTurn == frstTurn || frthTurn == scndTurn || frthTurn == thrdTurn) {
            opponentLogic.getBotInputs();
            frthTurn = opponentLogic.botInput;
        }
        System.out.print("Computer's turn!");
        consoleOutput.BotInputsToOutput(opponentLogic.botInput);

        //fifth Turn
        userInputs.getUserInputs();
        fivtTurn = userInputs.userInputSlot;
        if (fivtTurn == frstTurn || fivtTurn == scndTurn || fivtTurn == thrdTurn || fivtTurn == frthTurn) {
            System.out.println("This slot is already occupied! Pick another that is not " + frstTurn + ", " + scndTurn + ", " + thrdTurn + " or " + frthTurn);
            userInputs.getUserInputs();
            fivtTurn = userInputs.userInputSlot;
        }
        System.out.print("User's turn!");
        consoleOutput.UserInputsToOutput(userInputs.userInputSlot);

        logicIfUserWon();
        if (userWon) {
            System.exit(1);
        }

        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //sixth Turn
        opponentLogic.getBotInputs();
        sixtTurn = opponentLogic.botInput;
        while (sixtTurn == frstTurn || sixtTurn == scndTurn || sixtTurn == thrdTurn || sixtTurn == frthTurn || sixtTurn == fivtTurn) {
            opponentLogic.getBotInputs();
            sixtTurn = opponentLogic.botInput;
        }
        System.out.print("Computer's turn!");
        consoleOutput.BotInputsToOutput(opponentLogic.botInput);

        logicIfBotWon();
        if (botWon) {
            System.exit(1);
        }

        //seventh Turn
        userInputs.getUserInputs();
        sevtTurn = userInputs.userInputSlot;
        if (sevtTurn == frstTurn || sevtTurn == scndTurn || sevtTurn == thrdTurn || sevtTurn == frthTurn || sevtTurn == fivtTurn || sevtTurn == sixtTurn) {
            System.out.println("This slot is already occupied! Pick another that is not " + frstTurn + ", " + scndTurn + ", " + thrdTurn + ", " + frthTurn + ", " + fivtTurn + " or " + sixtTurn);
            userInputs.getUserInputs();
            sevtTurn = userInputs.userInputSlot;
        }
        System.out.print("User's turn!");
        consoleOutput.UserInputsToOutput(userInputs.userInputSlot);

        logicIfUserWon();
        if (userWon) {
            System.exit(1);
        }

        try {
            Thread.sleep(1000); // Pause for 1 second (1000 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //eight Turn
        opponentLogic.getBotInputs();
        eigtTurn = opponentLogic.botInput;
        while (eigtTurn == frstTurn || eigtTurn == scndTurn || eigtTurn == thrdTurn || eigtTurn == frthTurn || eigtTurn == fivtTurn || eigtTurn == sixtTurn || eigtTurn == sevtTurn) {
            opponentLogic.getBotInputs();
            eigtTurn = opponentLogic.botInput;
        }
        System.out.print("Computer's turn!");
        consoleOutput.BotInputsToOutput(opponentLogic.botInput);

        logicIfBotWon();
        if (botWon) {
            System.exit(1);
        }

        //ninth Turn
        userInputs.getUserInputs();
        nintTurn = userInputs.userInputSlot;
        if (nintTurn == frstTurn || nintTurn == scndTurn || nintTurn == thrdTurn || nintTurn == frthTurn || nintTurn == fivtTurn || nintTurn == sixtTurn || nintTurn == sevtTurn || nintTurn == eigtTurn) {
            System.out.println("This slot is already occupied! Pick another that is not " + frstTurn + ", " + scndTurn + ", " + thrdTurn + ", " + frthTurn + ", " + fivtTurn + ", " + sixtTurn + ", " + sevtTurn + " or " + eigtTurn);
            userInputs.getUserInputs();
            nintTurn = userInputs.userInputSlot;
        }
        System.out.print("User's turn!");
        consoleOutput.UserInputsToOutput(userInputs.userInputSlot);

        logicIfUserWon();
        if (userWon) {
            System.exit(1);
        }

        if (!botWon) {
            System.out.println("It's a draw!");
        }
    }
}