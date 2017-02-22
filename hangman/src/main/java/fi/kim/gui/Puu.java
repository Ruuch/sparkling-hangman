package fi.kim.gui;

import javax.swing.JLabel;

/**
 *
 * @author sepkim
 */
public class Puu {
    
    private JLabel[] puut;
    private int i = 0;
    
    public Puu(JLabel[] puut) {
        this.puut = puut;
        piilota();
    }
    
    public void etene() {
        puut[i].setVisible(true);
        i++;
    }
    
    public void piilota() {
        for (JLabel puu : puut) {
            puu.setVisible(false);
        }
        i = 0;
    }
}
