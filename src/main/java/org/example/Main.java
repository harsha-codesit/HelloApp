package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String output;

        // If no arguments → default
        if (args.length == 0) {
            output = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            output = "Hello, " + names + "!";
        }

        // Print result
        System.out.println(output);
    }
}