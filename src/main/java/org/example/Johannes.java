package org.example;

public class Johannes {
    public String makeFlurry() throws Exception {
        System.out.println("Bestellung erhalten!");
        System.out.println("Ich mache das McFlurry mit Smarties");
        throw new Exception("Eismaschine Kaputt..."); // was kann ich hier machen?? 1. Wir geben das Problem weiter 2. Wir kümmern uns selbst um das Problem -> try{} catch{} 3. Wir verpacken sie schön <3
    }
}
