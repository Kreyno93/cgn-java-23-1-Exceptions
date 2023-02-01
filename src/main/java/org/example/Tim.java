package org.example;

public class Tim {

    public String orderMcFlurry() throws Exception {
        System.out.println("Alles klar, Bestellung aufgenommen!");
        System.out.println("Ein McFlurry bitte!");
        return new Johannes().makeFlurry();
    }
}
