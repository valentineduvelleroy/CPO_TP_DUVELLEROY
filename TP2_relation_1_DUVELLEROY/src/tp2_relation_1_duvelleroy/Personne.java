/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_duvelleroy;

/**
 *
 * @author valen
 */
public class Personne {
    public String prenom;
    public String nom;
    public int nbVoitures;
    public Voiture[] liste_voitures;
            
            
    public Personne(String unPrenom, String unNom, int unnb, Voiture[] uneliste){
        prenom = unPrenom;
        nom = unNom;
        nbVoitures = unnb;
        liste_voitures = uneliste;
    }
    
        @Override
        public String toString(){
            String P;
            P = prenom + " " + nom + " " + nbVoitures + " " + liste_voitures;
            return P;
        }
    
}
