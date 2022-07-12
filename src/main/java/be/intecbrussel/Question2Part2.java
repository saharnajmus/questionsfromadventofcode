package be.intecbrussel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question2Part2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/uzair/Documents/AdventOfCode/input2P2.txt"))) {
            String line = null;
            int horizontalPosition = 0;
            int depth = 0;
            int aim = 0;
            int product = 1;
            while ((line = reader.readLine()) != null) {
                int lengthOfString = line.length();

                if (line.contains("forward")) {
                    String lastCharacter = (line.substring(lengthOfString - 1));
                    horizontalPosition += Integer.parseInt(lastCharacter);
                    depth += ( aim * Integer.parseInt(lastCharacter));
                } else if (line.contains("down")) {
                    String lastCharacter = (line.substring(lengthOfString - 1));
                    aim += (Integer.parseInt(lastCharacter));

                } else if (line.contains("up")) {
                    String lastCharacter = (line.substring(lengthOfString - 1));
                    aim -= Integer.parseInt(lastCharacter);
                }
            }
                product = horizontalPosition * depth;

                System.out.println("aim =" + aim);
                System.out.println("horizontal position =" + horizontalPosition);
                System.out.println("depth =" + depth);
                System.out.println("product =" + product);


        } catch (IOException e) {
            System.out.println("oops! something went wrong");
            System.out.println(e.getMessage());
        }
    }
}
