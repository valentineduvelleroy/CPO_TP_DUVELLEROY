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
public class BouteilleBiere { //Création de la classe BouteilleBiere + attribut
    public String nom;
    public float degreAlcool;
    public String brasserie; 
    public boolean ouverte;
    

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);

    }

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) { //Création du constructeur
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    public boolean Decapsuler() { //Méthode Decapsuler
        if (ouverte == false) { 
            ouverte = true; //On fait passer le booléen faux à vrai, la bière est maintenant ouverte
            System.out.println("La bière est ouverte");
        return true;} //Retourne vrai
        else {
            System.out.println("La biere n'est pas ouverte");
            return false; //Retourne faux si la bière n'est pas ouverte
            
        }
    }
@Override   
public String toString() {
String chaine_a_retourner; 
chaine_a_retourner = nom +" "+ degreAlcool + " degrès ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ; //Booléen vrai: réponse oui a bière ouverte 
else chaine_a_retourner += "non" ; //Booléen faux: réponse non à bière ouverte
return chaine_a_retourner ;
    }
}

