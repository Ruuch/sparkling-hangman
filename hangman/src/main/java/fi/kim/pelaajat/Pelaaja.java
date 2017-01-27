package fi.kim.pelaajat;

/**
 *
 * @author sepkim
 */
public class Pelaaja {

    private int pisteet;
    
    public Pelaaja() {
        this.pisteet = 0;
    }

    public int getPisteet() {
        return pisteet;
    }
    
    public void lisaaPiste() {
        this.pisteet += 1;
    }
    
    
}
