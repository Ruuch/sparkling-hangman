package fi.kim.pelaajat;

import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;

/**
 *
 * @author sepkim
 */
public class Pelaaja {

    private int pisteet;
    private int virheArvauksia;
    private Sana sana;
    private SanaArpoja arpoja;
    
    public Pelaaja(SanaArpoja arpoja) {
        this.pisteet = 0;
        this.virheArvauksia = 0;
        this.arpoja = arpoja;
        sana = new Sana(arpoja.arvoSana());
    }
    
    /**
     * Arvaa kirjain ja muuta sanan boolean taulukkoa jos oikein.
     * @param kirjain Arvaus.
     */
    public boolean arvaa(char kirjain) {
        if (!sana.arvaa(kirjain)) {
            virheArvauksia++;
            return false;
//            if (virheArvauksia >= 9) {
//                sanaVaarin();
//            }
        }
        return true;
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
    
//    public void sanaOikein() {
//        this.pisteet += 2;
//    }
//    
//    public void sanaVaarin() {
//        this.pisteet -= 1;
//        uusiSana();
//    }
    
    public String sanaToString() {
        return sana.getSana();
    }

    public int getVirheArvauksia() {
        return virheArvauksia;
    }
    
    
}
