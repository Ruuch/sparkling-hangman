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
    
    public void arvaa(char kirjain) {
        if (!sana.arvaa(kirjain)) {
            virheArvauksia++;
            if (virheArvauksia >= 9) {
                sanaVaarin();
            }
        }
    }
    
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
    
    public void sanaOikein() {
        this.pisteet += 2;
    }
    
    public void sanaVaarin() {
        this.pisteet -= 1;
        uusiSana();
    }
    
    public String sanaToString() {
        return sana.getSana();
    }
    
    
}
