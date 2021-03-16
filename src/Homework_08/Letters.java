package Homework_08;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text please: ");
        String text = scanner.nextLine();
        System.out.println(toUpperCaseForFirstLetter(text));

    }
    private static String toUpperCaseForFirstLetter(String text) {
        StringBuilder builder = new StringBuilder(text.toLowerCase());
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        return builder.toString();
    }
}


