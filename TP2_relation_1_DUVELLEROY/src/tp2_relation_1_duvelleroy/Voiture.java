/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_duvelleroy;

/**
 *
 * @author valen
 */
public class Voiture {
    public String Modele;
    public String Marque;
    public int PuissanceCV;
    
    public Voiture(String unModele, String uneMarque, int unePuissance){
    Modele = unModele;
    Marque = uneMarque;
    PuissanceCV = unePuissance;
    }
    
    @Override
    public String toString() {
        String V;
        V = Modele + " " + Marque + " " + PuissanceCV;
        return V;
    }
    
}
