import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Question3 {
    public static void main(String[] args) {
        List<Integer> listOfOnes = new ArrayList();
        List<Integer> listOfZeros = new ArrayList();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/uzair/Documents/AdventOfCode/testInput3.txt"))){
         String line= null;
         while((line = bufferedReader.readLine())!=null){

         }
        }
        catch (IOException e){
            System.out.println("something went wrong!!!!");
            e.getMessage();

        }

    }
}
