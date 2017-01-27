package fi.kim.pelaajat;

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
    public void setUp() {
        pelaaja = new Pelaaja();
    }

    @Test
    public void pelaajaAlussaOikein() {
        assertEquals(0, pelaaja.getPisteet());
    }

    @Test
    public void lisaaPisteLisaaPisteen() {
        pelaaja.lisaaPiste();

        assertEquals(1, pelaaja.getPisteet());
    }

}
