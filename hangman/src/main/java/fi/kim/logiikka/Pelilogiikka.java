package fi.kim.logiikka;

import fi.kim.pelaajat.Pelaaja;
import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;

/**
 *
 * @author sepkim
 */
public class Pelilogiikka {

    SanaArpoja arpoja;
    char arvaus;

    public Pelilogiikka() throws Exception {
        arpoja = new SanaArpoja();
    }

    public void kaynnista() {
        Pelaaja pelaaja1 = new Pelaaja(arpoja);
        
        System.out.println(pelaaja1.sanaToString());
        pelaaja1.arvaa('a');
        System.out.println(pelaaja1.getSana().sanaPiilotetuillaKirjaimilla());
    }
}
