package org.example;

public class HelloApp {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        if (args.length == 0) {
            sb.append("Hello, World!");
        } else {
            sb.append("Hello, ");

            boolean first = true;
            for (String name : args) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(name);
                first = false;
            }

            sb.append("!");
        }
        System.out.println(sb.toString());
    }
}