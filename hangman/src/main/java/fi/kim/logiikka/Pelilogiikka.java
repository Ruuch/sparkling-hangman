package fi.kim.logiikka;

import fi.kim.gui.Kayttoliittyma;
import fi.kim.pelaajat.Pelaaja;
import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;
import javax.swing.SwingUtilities;

/**
 *
 * @author sepkim
 */
public class Pelilogiikka {

    private SanaArpoja arpoja;
    private Kayttoliittyma kayttoliittyma;
    private Pelaaja pelaaja1;

    public Pelilogiikka() throws Exception {
        arpoja = new SanaArpoja();
        this.kayttoliittyma = new Kayttoliittyma();
        this.pelaaja1 = new Pelaaja(arpoja);
    }

    public void kaynnista() {
        
        System.out.println("arvattava sana on: " + pelaaja1.sanaToString());
        
        luoUI();
        
        
        
    }
    
    public void luoUI() {
        SwingUtilities.invokeLater(kayttoliittyma);
        kayttoliittyma.lisaaKuuntelija(pelaaja1);
        kayttoliittyma.setArvattavaSanaKentta(pelaaja1.getSana().sanaPiilotetuillaKirjaimilla());
    }
}
