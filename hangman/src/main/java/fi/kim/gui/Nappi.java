package fi.kim.gui;

/**
 *
 * @author sepkim
 */
public class Nappi {
    
    private int posX;
    private int posY;
    private String teksti;
    private boolean onAktiivinen;
    
    public Nappi(int posX, int posY, String teksti, boolean onAktiivinen) {
        this.posX = posX;
        this.posY = posY;
        this.teksti = teksti;
        this.onAktiivinen = onAktiivinen;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getTeksti() {
        return teksti;
    }
    
    public boolean onAktiivinen() {
        return onAktiivinen;
    }
    
    public void disable() {
        onAktiivinen = false;
    }
    
    public void enable() {
        onAktiivinen = true;
    }
}
