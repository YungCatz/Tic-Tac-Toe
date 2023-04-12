public class ConsoleOutput {
    public String x = "\uD801\uDD27";
    public String o = "໐";
    public String blank = " ";
    String[][] arr = new String[3][3];

    public ConsoleOutput() {
        arr[0][0] = blank;
        arr[0][1] = blank;
        arr[0][2] = blank;
        arr[1][0] = blank;
        arr[1][1] = blank;
        arr[1][2] = blank;
        arr[2][0] = blank;
        arr[2][1] = blank;
        arr[2][2] = blank;
    }

    public void outputInConsole() {
        System.out.println("\n⸺⸺⸺⸺⸺⸺⸺⸺⸺\n");
        System.out.println("         " + arr[0][0] + " ┃ " + arr[0][1] + " ┃ " + arr[0][2] + " ");
        System.out.println("        ━━━╋━━━╋━━━");
        System.out.println("         " + arr[1][0] + " ┃ " + arr[1][1] + " ┃ " + arr[1][2] + " ");
        System.out.println("        ━━━╋━━━╋━━━");
        System.out.println("         " + arr[2][0] + " ┃ " + arr[2][1] + " ┃ " + arr[2][2] + " ");
        System.out.println("\n⸺⸺⸺⸺⸺⸺⸺⸺⸺\n");
    }

    public void UserInputsToOutput(int userInputSlot) {
        if (userInputSlot == 1) {
            arr[0][0] = x;
            outputInConsole();
        } else if (userInputSlot == 2) {
            arr[0][1] = x;
            outputInConsole();
        } else if (userInputSlot == 3) {
            arr[0][2] = x;
            outputInConsole();
        } else if (userInputSlot == 4) {
            arr[1][0] = x;
            outputInConsole();
        } else if (userInputSlot == 5) {
            arr[1][1] = x;
            outputInConsole();
        } else if (userInputSlot == 6) {
            arr[1][2] = x;
            outputInConsole();
        } else if (userInputSlot == 7) {
            arr[2][0] = x;
            outputInConsole();
        } else if (userInputSlot == 8) {
            arr[2][1] = x;
            outputInConsole();
        } else if (userInputSlot == 9) {
            arr[2][2] = x;
            outputInConsole();
        } else System.out.println("Not a Valid Input");
    }

    public void BotInputsToOutput(int botInput) {
        if (botInput == 1) {
            arr[0][0] = o;
            outputInConsole();
        } else if (botInput == 2) {
            arr[0][1] = o;
            outputInConsole();
        } else if (botInput == 3) {
            arr[0][2] = o;
            outputInConsole();
        } else if (botInput == 4) {
            arr[1][0] = o;
            outputInConsole();
        } else if (botInput == 5) {
            arr[1][1] = o;
            outputInConsole();
        } else if (botInput == 6) {
            arr[1][2] = o;
            outputInConsole();
        } else if (botInput == 7) {
            arr[2][0] = o;
            outputInConsole();
        } else if (botInput == 8) {
            arr[2][1] = o;
            outputInConsole();
        } else if (botInput == 9) {
            arr[2][2] = o;
            outputInConsole();
        } else System.out.println("Not a Valid Input");
    }
}
