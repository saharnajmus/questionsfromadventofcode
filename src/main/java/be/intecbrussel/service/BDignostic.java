package be.intecbrussel.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BDignostic {
    List<Integer> listOfZeros = new ArrayList<>();
    List<Integer> listOfOnes  = new ArrayList<>();
    List<Integer> gemma  = new ArrayList<>();
    List<Integer> epsilon  = new ArrayList<>();
    public void getColValues() {
        int col = 0;
           loop:
        while (true) {

            String[] data = readCol(col++, "C:/Users/uzair/Documents/AdventOfCode/InputThree.txt", "");
            System.out.println("col:" +col);
          if(data.length==0){
              break loop;
          }


            for (int i = 0; i < data.length; i++) {
                Integer integerValue = Integer.parseInt(data[i]);
                if (integerValue == 1) {
                    listOfOnes.add(integerValue);
                } else {
                    listOfZeros.add(integerValue);
                }

            }


            // System.out.println("  " + data[i]);
            System.out.println("zeroslist" + listOfZeros.toString());
            System.out.println("oneslist" + listOfOnes.toString());
            getValues(listOfZeros, listOfOnes);
            listOfOnes.clear();
            listOfZeros.clear();
            System.out.println("zeroslist " + listOfZeros.toString());
            System.out.println("oneslist after clear method" + listOfOnes.toString());
        }
    }
    public String[] readCol(int col, String filePath, String delimiter) {
        String[] data;
        String currentLine;
        ArrayList<String> colData = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            // String line = null;
             loop2:
            while (((currentLine = bufferedReader.readLine()) != null)) {
                if((col>=currentLine.length())){

                    return new String[0];
                }
                System.out.println("CurrentLine " + currentLine);
                data = currentLine.split(delimiter);
                colData.add(data[col]);
            }
        } catch (
                IOException e) {
            System.out.println("something went wrong!!!!");
            e.getMessage();

        }
        return colData.toArray(new String[0]);
    }

    public List<Integer> getGemma() {
        return gemma;
    }

    public List<Integer> getEpsilon() {
        return epsilon;
    }

    public void getValues(List<Integer> zerosList, List<Integer> onesList) {
        if (zerosList.size() > onesList.size()) {
            gemma.add(0);
            epsilon.add(1);
        } else if (zerosList.size() < onesList.size()) {
            gemma.add(1);
            epsilon.add(0);
        }
     /*   String gemmaString = gemma.toString();
        String epsilonString = epsilon.toString();


            System.out.println("GemmaString = " + gemmaString);
            System.out.println("EpsilonString= " + epsilonString);*/


          /*  System.out.println("GemmaDecimal " + gemmaDecimal);
            System.out.println("EpsilonDecimal " + epsilonDecimal);*/

        }



    }


