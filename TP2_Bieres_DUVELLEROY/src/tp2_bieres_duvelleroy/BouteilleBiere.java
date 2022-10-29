/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_duvelleroy;

import static java.time.Clock.system;

/**
 *
 * @author valen
 */
public class BouteilleBiere {
    public String nom;
    public float degreAlcool;
    public String brasserie;
    public boolean ouverte;
    

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);

    }

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public boolean Decapsuler() {
        if (ouverte == false) { 
            ouverte = true;
            System.out.println("La bière est ouverte");
        return true;}
        else {
            System.out.println("La biere n'est pas ouverte");
            return false;
            
        }
    }
@Override   
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom +" "+ degreAlcool + " degrès ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}

