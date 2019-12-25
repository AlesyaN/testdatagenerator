package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        Writer writer = new Writer();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.println("Enter type of new test object: (Account, Answer, Comment)");
            String type = scanner.next();
            String json = generator.generateJsonFromObject(type);
            System.out.println(json);
            writer.write(json);
        }
    }
}
