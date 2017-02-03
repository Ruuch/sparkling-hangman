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

    public Pelilogiikka() throws Exception {
        arpoja = new SanaArpoja();
    }

    public void kaynnista() {
        Pelaaja pelaaja1 = new Pelaaja(arpoja);
        
        System.out.println("arvattava sana on: " + pelaaja1.sanaToString());
        pelaaja1.arvaa('a');
        pelaaja1.arvaa('e');
        pelaaja1.arvaa('o');
        System.out.println(pelaaja1.getSana().sanaPiilotetuillaKirjaimilla());
    }
}
