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
public class SanaArpojaTest {
    
    SanaArpoja sanaArpoja;
    
    public SanaArpojaTest() {
    }
    
    @Before
    public void setUp() {
        try {
            sanaArpoja = new SanaArpoja();
        } catch (Exception e) {
            System.out.println("Arpojan luonti epäonnistui!");
        }
    }
    
    @Test
    public void arpojaLisaaSanojaListaanAlussa() {
        assertEquals(false, sanaArpoja.getSanat().isEmpty());
    }
    
    @Test
    public void listastaLoytyyOikeitaSanoja() {
        assertEquals(true, sanaArpoja.getSanat().contains("mursu"));
        assertEquals(true, sanaArpoja.getSanat().contains("vene"));
        assertEquals(true, sanaArpoja.getSanat().contains("auto"));
    }
    
    @Test
    public void arvoSanaArpooSanan() {
        String testi = "asd";
        testi = sanaArpoja.arvoSana();
        
        assertNotEquals("asd", testi);
    }
    
    



}
