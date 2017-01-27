package fi.kim.sanat;

/**
 *
 * @author sepkim
 */
public class Sana {
    
    private String sana;
    private boolean vinkkiKayttamatta;
    
    public Sana(String sana) {
        this.sana = sana;
        this.vinkkiKayttamatta = true;
    }
    
    public void uusiSana(SanaArpoja arpoja) {
        sana = arpoja.arvoSana();
        this.vinkkiKayttamatta = true;
    }
    
    public void kaytaVinkki() {
        this.vinkkiKayttamatta = false;
    }
    
    public boolean vinkkiKayttamatta() {
        return vinkkiKayttamatta;
    }

    @Override
    public String toString() {
        return sana;
    }

    public String getSana() {
        return sana;
    }
    
    
    
    
}
