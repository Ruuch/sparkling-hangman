package fi.kim.gui;

import javax.swing.JLabel;

/**
 * Luokka sisältää listan jossa on JLabel olioita jotka kuvastavat Puun osia.
 * @author sepkim
 */
public class Puu {
    
    private JLabel[] puut;
    private int i = 0;
    
    /**
     * luo puut ja piilota ne.
     * @param puut 
     */
    public Puu(JLabel[] puut) {
        this.puut = puut;
        piilota();
    }
    
    /**
     * tuo näkyviin seuraava puun osa.
     */
    public void etene() {
        puut[i].setVisible(true);
        i++;
    }
    
    /**
     * piilottaa puun osat.
     */
    public void piilota() {
        for (JLabel puu : puut) {
            puu.setVisible(false);
        }
        i = 0;
    }
}