package fi.kim.sanat;

/**
 * Luokka pitää kirjaa arvattavasta sanasta.
 * @author sepkim
 */
public class Sana {
    
    private String sana;
    private boolean vinkkiKayttamatta;
    private boolean[] arvatutKirjaimet;
    
    /**
     * Konstruktori alustaa tarvittavat muuttujat.
     * @param sana 
     */
    public Sana(String sana) {
        this.sana = sana;
        this.vinkkiKayttamatta = true;
        arvatutKirjaimet = new boolean[sana.length()];
    }
    
    /**
     * Arpoo uuden sanan.
     * @param arpoja Arpoja jota käytetään arpomiseen.
     */
    public void uusiSana(SanaArpoja arpoja) {
        sana = arpoja.arvoSana();
        this.vinkkiKayttamatta = true;
    }
    
    /**
     * Käyttää vinkin.
     */
    public void kaytaVinkki() {
        this.vinkkiKayttamatta = false;
    }
    
    /**
     * Tarkistaa vinkin tilan.
     * @return Palauttaa true jos vinkki on käyttämättä.
     */
    public boolean vinkkiKayttamatta() {
        return vinkkiKayttamatta;
    }
    
    public boolean[] getArvatutKirjaimet() {
        return arvatutKirjaimet;
    }
    
    /**
     * Palauttaa merkkijonon jossa arvattavasta sanasta on näkyvillä vain ne 
     * kirjaimet, jotka on jo arvattu.
     * @return Palauttaa sanan siten että arvaamattomat kirjaimet ovat piilossa.
     */
    public String sanaPiilotetuillaKirjaimilla() {
        String palautettava = "";
        int i = 0;
        
        for (char kirjain : sana.toCharArray()) {     //lisää arvatut kirjaimet palautettavaan merkkijonoon,
            if (arvatutKirjaimet[i] == true) {        //muiden kohdalle alaviiva
                palautettava += kirjain;
            } else {
                palautettava += "_";
            }
            
            if (i < sana.length() - 1) {
                palautettava += ".";
            }
            i++;
        }
        return palautettava;
    }
    
    /**
     * Arvaa kirjaimen.
     * @return Palauttaa true jos arvaus oli oikein.
     * @param kirjain Kirjain jota pelaaja arvaa.
     */
    public boolean arvaa(char kirjain) {
        int i = 0;
        boolean oikeinArvattu = false;
        
        for (char c : sana.toCharArray()) {
            if (c == kirjain) {
                arvatutKirjaimet[i] = true;
                oikeinArvattu = true;
            }
            
            i++;
        }
        return oikeinArvattu;
    }
    
    /**
     * Tarkistaa onko kaikki sanan kirjaimet jo arvattu.
     * @return palauttaa true jos kaikki kirjaimet on arvattu.
     */
    public boolean kaikkiKirjaimetArvattu() {
        boolean voitto = true;
        for (boolean b : arvatutKirjaimet) {
            if (!b) {
                voitto = false;
            }
        }
        
        return voitto;
    }

    @Override
    public String toString() {
        return sana;
    }

    public String getSana() {
        return sana;
    }
    
    /**
     * Asettaa kaikki kirjaimet näkyviksi.
     */
    public void naytaKokoSana() {
        for (int i = 0; i < arvatutKirjaimet.length; i++) {
            arvatutKirjaimet[i] = true;
        }
    }
    
    
}
