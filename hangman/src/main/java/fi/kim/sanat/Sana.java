package fi.kim.sanat;

/**
 *
 * @author sepkim
 */
public class Sana {
    
    private String sana;
    private boolean vinkkiKayttamatta;
    private boolean[] arvatutKirjaimet;
    
    public Sana(String sana) {
        this.sana = sana;
        this.vinkkiKayttamatta = true;
        arvatutKirjaimet = new boolean[sana.length()];
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
    
    public boolean[] getArvatutKirjaimet() {
        return arvatutKirjaimet;
    }
    
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
    
    
    
    
}
