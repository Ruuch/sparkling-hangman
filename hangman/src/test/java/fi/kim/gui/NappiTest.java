package fi.kim.gui;

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
public class NappiTest {
    
    Nappi nappi;
    
    public NappiTest() {
    }
    
    @Before
    public void setUp() {
        nappi = new Nappi(1, 2, "moi", true);
    }
    

    public void nappiLuodaanOikein() {
        assertEquals(1, nappi.getPosX());
        assertEquals(2, nappi.getPosY());
        assertEquals("moi", nappi.getTeksti());
        assertEquals(true, nappi.onAktiivinen());
    }
    
    public void nappiMeneePaalleJaPois() {
        nappi.disable();
        assertEquals(false, nappi.onAktiivinen());
        nappi.enable();
        assertEquals(true, nappi.onAktiivinen());
    }
    
    
    
}
