package fi.kim;

import fi.kim.logiikka.Pelilogiikka;

/**
 * Pelin Main luokka.
 * @author sepkim
 */
public class Main {
    
    /**
     * main metodi.
     * @param args 
     */
    public static void main(String[] args) {
        try {
            new Pelilogiikka().kaynnista();
        } catch (Exception e) {
            System.out.println("Pelilogiikkaa luodessa sana-arpoja meni rikki!"); //huono tapa handlata ekseptio, lupaan korjata! :D
        }
 
    }
    
}
