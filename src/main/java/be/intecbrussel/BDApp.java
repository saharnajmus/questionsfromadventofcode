package be.intecbrussel;

import be.intecbrussel.service.BinaryDiagnostic;

public class BDApp {
    public static void main(String[] args) {
        BinaryDiagnostic binaryDiagnostic = new BinaryDiagnostic();
        binaryDiagnostic.getGemmaAndEpsilon();
        System.out.println("Product of values " + binaryDiagnostic.getProduct());
        // System.out.println("main gm " + binaryD);

    }
}