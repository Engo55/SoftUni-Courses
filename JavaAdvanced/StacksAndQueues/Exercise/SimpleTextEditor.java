package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();

        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine();

            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);
            switch (commandNumber) {
                case 1:
                    textStack.push(currentText.toString());
                    String stringForAppend = command.split("\\s+")[1];
                    // must add "stringForAppend" to current text
                    currentText.append(stringForAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsForDelete = Integer.parseInt(command.split("\\s+")[1]);
                    // delete countElementForDelete number of elements
                    int startIndexForDelete = currentText.length() - countElementsForDelete;
                    currentText.delete(startIndexForDelete, currentText.length());
                    break;
                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    //print index's element
                    System.out.println(currentText.charAt(index - 1));
                    break;
                case 4:
                    if (!textStack.isEmpty()) {
                        currentText = new StringBuilder(textStack.pop());
                    }
                    break;
            }
        }
    }
}
