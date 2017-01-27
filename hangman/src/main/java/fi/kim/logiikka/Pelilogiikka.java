package fi.kim.logiikka;

import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;

/**
 *
 * @author sepkim
 */
public class Pelilogiikka {
    
    SanaArpoja arpoja;
    
    public Pelilogiikka() throws Exception { 
        arpoja = new SanaArpoja();
    }
    
    public void kaynnista() {
        Sana sana1 = new Sana(arpoja.arvoSana());
        System.out.println(sana1);
    }
}
