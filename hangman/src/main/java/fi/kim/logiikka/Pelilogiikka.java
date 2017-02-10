package fi.kim.logiikka;

import fi.kim.gui.Kayttoliittyma;
import fi.kim.pelaajat.Pelaaja;
import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;
import javax.swing.SwingUtilities;

/**
 * Hoitaa valtaosan pelin varsinaisesta suorituksesta ja etenemisestä.
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

    
    /**
     * Metodi kaynnistaa ohjelman ja kutsuu käyttöliittymää.
     */
    public void kaynnista() {
        
        System.out.println("arvattava sana on: " + pelaaja1.sanaToString());
        
        luoUI();
        
        
        
    }
    
    /**
     * alustaa UI elementtejä joita generoitu 
     * Kayttoliittyma luokka ei anna muokata.
     */
    public void luoUI() {
        SwingUtilities.invokeLater(kayttoliittyma);
        kayttoliittyma.lisaaKuuntelija(pelaaja1);
        kayttoliittyma.setArvattavaSanaKentta(pelaaja1.getSana().sanaPiilotetuillaKirjaimilla());
    }
}
