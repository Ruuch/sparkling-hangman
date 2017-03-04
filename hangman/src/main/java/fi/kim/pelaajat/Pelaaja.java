package fi.kim.pelaajat;

import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;

/**
 * Pelaaja luokka pitää kirjaa pelaajan sekä osittain sanan tilasta.
 *
 * @author sepkim
 */
public class Pelaaja {

    private int pisteet;
    private int virheArvauksia;
    private Sana sana;
    private SanaArpoja arpoja;
    String arvatutKirjaimet;

    /**
     * Konstruktori alustaa pelaajan tilaa pitävät muuttujat ja luo sanan.
     *
     * @param arpoja SanaArpoja olio, jolla arvotaan sana.
     */
    public Pelaaja(SanaArpoja arpoja) {
        this.pisteet = 0;
        this.virheArvauksia = 0;
        this.arpoja = arpoja;
        sana = new Sana(arpoja.arvoSana());
        this.arvatutKirjaimet = "";
    }

    /**
     * Arvaa kirjain ja muuta sanan boolean taulukkoa jos oikein.
     *
     * @param kirjain Arvaus.
     * @return onko arvaus oikein
     */
    public boolean arvaa(char kirjain) {
        if (!sana.arvaa(kirjain)) {
            virheArvauksia++;
            if (arvatutKirjaimet.isEmpty()) {
                arvatutKirjaimet += kirjain;
            } else {
                arvatutKirjaimet += ", " + kirjain;
            }
            return false;
//            if (virheArvauksia >= 9) {
//                sanaVaarin();
//            }
        }
        return true;
    }

    /**
     * Arvaa koko sanan kerralla.
     * @param arvaus Pelaajan arvaus.
     * @return palauttaa true, jos arvaus oli oikein.
     */
    public boolean arvaaKokoSana(String arvaus) {
        if (!arvaus.equals(sana.getSana())) {
            virheArvauksia++;
            return false;
        } else {
            sana.naytaKokoSana();
            return true;
        }
    }

    /**
     * Kutsuu sanan uusiSana metodia.
     */
    public void uusiSana() {
        sana.uusiSana(arpoja);
        virheArvauksia = 0;
    }

    public Sana getSana() {
        return sana;
    }

    public int getPisteet() {
        return pisteet;
    }

    /**
     * Hakee sanan string muodossa.
     *
     * @return Sana string muodossa.
     */
    public String sanaToString() {
        return sana.getSana();
    }

    public int getVirheArvauksia() {
        return virheArvauksia;
    }

    public String getArvatutKirjaimet() {
        return arvatutKirjaimet;
    }

}
