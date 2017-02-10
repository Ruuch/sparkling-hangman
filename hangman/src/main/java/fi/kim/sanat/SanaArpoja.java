package fi.kim.sanat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sepkim
 */
public class SanaArpoja {

    private Scanner lukija;
    private ArrayList<String> sanat;

    public SanaArpoja() throws Exception {
        this.lukija = new Scanner(new File("sanat.txt"));
        System.out.println("Tiedoston luku onnistui!");
        this.sanat = new ArrayList<>();
        lueSanatListaan();
    }

    /**
     * Arpoo uuden sanan listalta ja palauttaa sen merkkijonona.
     */
    public String arvoSana() {
        Random random = new Random();
        return sanat.get(random.nextInt(sanat.size() - 1)); //arpoo numeron väliltä 0-listan pituus, ja palauttaa 
    }                                                       //merkkijonon joka on listassa numeron osoittamalla sijainnilla

    /**
     * Lukee sanat tekstitiedostosta ja lisää ne listaan.
     */
    private void lueSanatListaan()  {

        String merkkijono = "";

        try {
            while (lukija.hasNextLine()) {
                merkkijono = lukija.nextLine();
                sanat.add(merkkijono);
            }

            lukija.close();
        } catch (Exception e) {
            System.out.println("Tiedostoa lukiessa sattui virhe!");
        }

    }

    public ArrayList<String> getSanat() {
        return sanat;
    }
    
    

}
