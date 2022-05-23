import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/uzair/Documents/AdventOfCode/input.txt"))) {
            String line = null;
            int count = 0;
            int previous = -1;

            while ((line = bufferedReader.readLine()) != null) {
                int next = Integer.parseInt(line);
                if (previous < next && previous != -1) {
                    count++;
                }
                previous = next;
            }
            System.out.println("count = " + count);
        } catch (IOException e) {
            System.out.println("oops! something went wrong");
            System.out.println(e.getMessage());
        }


    }
}
