package be.intecbrussel.service;


public class BinaryDiagnostic {

    private Long gemma;
    private Long epsilon;
    private Long product;

    public Long getProduct() {
        return product;
    }

    public Long getGemma() {
        return gemma;
    }

    public Long getEpsilon() {
        return epsilon;
    }


    public void getGemmaAndEpsilon() {
        BDignostic bDignostic = new BDignostic();
        bDignostic.getColValues();
        String gemmaString = bDignostic.getGemma().toString()
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replaceAll("\\,", "")
                .trim();
        String epsilonString = bDignostic.getEpsilon().toString()
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replaceAll("\\,", "")
                .trim();
        System.out.println("gS " + gemmaString);
        System.out.println(gemmaString.contains(" "));
        String gemmaWithOutSpaces = gemmaString.replaceAll("\\s+", "");
        String epsilonWithOutSpaces = epsilonString.replaceAll("\\s+", "");
        System.out.println("gemma contain spaces? " + gemmaWithOutSpaces.contains(" "));
        System.out.println("epsilon contain spaces? " + epsilonWithOutSpaces.contains(" "));

        gemma = Long.valueOf(gemmaWithOutSpaces, 2);
        epsilon = Long.valueOf(epsilonWithOutSpaces, 2);
        product = gemma * epsilon;
    }


}
