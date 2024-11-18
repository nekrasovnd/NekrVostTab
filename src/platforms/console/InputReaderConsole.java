package platforms.console;

import logic.Request;
import platforms.InputReader;

import java.util.Scanner;

public class InputReaderConsole implements InputReader {
    private final Scanner scanner;

    public InputReaderConsole() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Request read() {
        System.out.print("Please enter your message: ");
        String input = scanner.nextLine();
        return new Request(input);
    }
}