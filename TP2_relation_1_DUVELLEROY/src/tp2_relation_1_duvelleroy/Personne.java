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
            
            
    public Personne(String unPrenom, String unNom){
        prenom = unPrenom;
        nom = unNom;
        nbVoitures = 0;
        liste_voitures = new Voiture[3];
    }
    
        @Override
        public String toString(){
            String P;
            P = prenom + " " + nom + " " + nbVoitures;
            return P;
        }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
     if (nbVoitures == 3){
         System.out.println("Nombre de voitures maximum atteint");
         return false;
     }
     if (voiture_a_ajouter.proprietaire != null){
         System.out.println("Cette voiture a déjà un propriétaire");
         return false;
     }
     liste_voitures[nbVoitures] = voiture_a_ajouter;
     nbVoitures ++;
     voiture_a_ajouter.proprietaire = this ;
     return true;
}

}
