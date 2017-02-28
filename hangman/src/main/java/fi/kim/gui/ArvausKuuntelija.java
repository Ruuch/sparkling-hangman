package fi.kim.gui;

import fi.kim.pelaajat.Pelaaja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
    private JLabel vaariaArvauksia;
    private Puu puu;
    private JButton nappi;
    private JLabel arvatutKirjaimet;

    public ArvausKuuntelija(JTextField arvaus, Pelaaja pelaaja, JLabel sana,
            JLabel vaariaArvauksia, Puu puu, JButton nappi, JLabel arvatutKirjaimet) {
        this.arvaus = arvaus;
        this.pelaaja = pelaaja;
        this.sana = sana;
        this.vaariaArvauksia = vaariaArvauksia;
        this.puu = puu;
        this.nappi = nappi;
        this.arvatutKirjaimet = arvatutKirjaimet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!arvaus.getText().isEmpty()) {
            if (arvaus.getText().length() == 1) {
                if (pelaaja.arvaa(arvaus.getText().toCharArray()[0])) {
                    sana.setText(pelaaja.getSana().sanaPiilotetuillaKirjaimilla());
                } else {
                    vaariaArvauksia.setText(Integer.toString(pelaaja.getVirheArvauksia()));
                    puu.etene();
                    arvatutKirjaimet.setText(pelaaja.getArvatutKirjaimet());
                }
            } else {
                if (pelaaja.arvaaKokoSana(arvaus.getText())) {
                    sana.setText(pelaaja.getSana().sanaPiilotetuillaKirjaimilla());
                } else {
                    puu.etene();
                    sana.setText(pelaaja.getSana().sanaPiilotetuillaKirjaimilla());
                }
            }

            if (pelaaja.getVirheArvauksia() >= 7) {
                sana.setText("HÄVISIT");
                nappi.setEnabled(false);
            }
            arvaus.setText("");

            if (!sana.getText().contains("_")) {
                sana.setText("VOITIT!");
                nappi.setEnabled(false);
            }

        }
    }

}
