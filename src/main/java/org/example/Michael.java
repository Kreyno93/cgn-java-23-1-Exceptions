package org.example;

import javax.management.RuntimeMBeanException;

public class Michael {

    public void wantsMcFlurry() {
        System.out.println("Hallo, ich hätte gerne ein McFlurry");
        String mcFlurry;
        try {
            mcFlurry = new Tim().orderMcFlurry(); // hier tritt die Exception auf!
            System.out.println("Es hat geklappt!! Hier dein Eis!"); // nicht ausgeführt
        } catch (Exception error) {
            throw new RuntimeException("Bestellung nicht geklappt",error);
            // mcFlurry = "Chicken Nuggets weil die " + error.getMessage(); // hier gehts weiter
        }
        System.out.println("Danke, ich esse jetzt " + mcFlurry);
    }
}
