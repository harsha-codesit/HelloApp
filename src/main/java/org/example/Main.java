package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // If argument is provided, use it
        if (args.length > 0) {
            name = args[0];
        }

        // Print result
        System.out.println("Hello, " + name + "!");
    }
}