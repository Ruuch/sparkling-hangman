package fi.kim.pelaajat;

import fi.kim.sanat.Sana;
import fi.kim.sanat.SanaArpoja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sepkim
 */
public class PelaajaTest {

    Pelaaja pelaaja;

    public PelaajaTest() {
    }

    @Before
    public void setUp() throws Exception {
        pelaaja = new Pelaaja(new SanaArpoja());
    }

    @Test
    public void pelaajaAlussaOikein() {
        assertEquals(0, pelaaja.getPisteet());
    }
    
    @Test
    public void uusiSanaArpooUudenSana() {      //testi epäonnistuu n. 10% todennäköisyydellä, 
        String sana = pelaaja.sanaToString();   //sillä arpoja voi arpoa saman sanan uudelleen
        pelaaja.uusiSana();
        assertNotEquals(sana, pelaaja.sanaToString());
    }
    
    @Test
    public void arvaaminenToimii() {
        char kirjain = pelaaja.sanaToString().charAt(0);
        boolean oikein = pelaaja.arvaa(kirjain);
        assertEquals(true, pelaaja.getSana().getArvatutKirjaimet()[0]);
        assertEquals(true, oikein);
        assertEquals(false, pelaaja.arvaa('x'));
    }
    
    @Test
    public void arvaaKokoSanaToimii() {
        pelaaja.arvaaKokoSana("lol");
        assertEquals(1, pelaaja.getVirheArvauksia());
        pelaaja.arvaaKokoSana(pelaaja.sanaToString());
        assertEquals(true, pelaaja.getSana().kaikkiKirjaimetArvattu());
    }

}
