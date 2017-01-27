package fi.kim.sanat;

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
public class SanaTest {

    public SanaTest() {
    }

    Sana sana;

    @Before
    public void setUp() {
        sana = new Sana("Moi");
    }

    @Test
    public void sanaAlussaOikein() {
        assertEquals("Moi", sana.getSana());
        assertEquals(true, sana.vinkkiKayttamatta());
    }

    @Test
    public void uusiSanaArpooUudenSanan() {
        try {
            sana.uusiSana(new SanaArpoja());
        } catch (Exception e) {
            System.out.println("Sanan arpominen epäonnistui");
        }
        
        assertNotEquals("Moi", sana.getSana());
    }
    
    @Test
    public void kaytaVinkkiKayttaaVinkin() {
        sana.kaytaVinkki();
        
        assertEquals(false, sana.vinkkiKayttamatta());
    }
    
    

}