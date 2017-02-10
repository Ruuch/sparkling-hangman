package fi.kim.gui;

import fi.kim.pelaajat.Pelaaja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sepkim
 */
public class ArvausKuuntelija implements ActionListener {
    
    private JTextField arvaus;
    private Pelaaja pelaaja;
    private JLabel sana;
    
    public ArvausKuuntelija(JTextField arvaus, Pelaaja pelaaja, JLabel sana) {
        this.arvaus = arvaus;
        this.pelaaja = pelaaja;
        this.sana = sana;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        pelaaja.arvaa(arvaus.getText().toCharArray()[0]);
        sana.setText(pelaaja.getSana().sanaPiilotetuillaKirjaimilla());
    }
    
    
    
}
