/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_duvelleroy;

/**
 *
 * @author valen
 */
public class Personne { //Création de la classe Personne + attributs
    public String prenom;
    public String nom;
    public int nbVoitures;
    public Voiture[] liste_voitures;
            
            
    public Personne(String unPrenom, String unNom){ //Création du constructeur
        prenom = unPrenom;
        nom = unNom;
        nbVoitures = 0; //Initialisation à 0
        liste_voitures = new Voiture[3]; //Maximum de 3 places
    }
    
        @Override
        public String toString(){
            String P; //Chaine qui retourne les attributs complets
            P = prenom + " " + nom + " " + nbVoitures;
            return P;
        }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
     if (nbVoitures == 3){ 
         System.out.println("Nombre de voitures maximum atteint");
         return false; 
     }
     if (voiture_a_ajouter.proprietaire != null){ //Si la voiture appartient déjà à un propriétaire (différent de "n'a aucun propriétaire")
         System.out.println("Cette voiture a déjà un propriétaire");
         return false;
     } //Dans le cas ou nbVoitures < 3 et que la voiture n'appartientrtient à personne alors:
     liste_voitures[nbVoitures] = voiture_a_ajouter; //On rajoute la voiture dans la case qui correspond au nbVoitures que le propriétaire possède
     nbVoitures ++; //Incrémentation (ajoite +1 à nbVoitures)
     voiture_a_ajouter.proprietaire = this ;//L'objet qui est le propriétaire
     return true;
}

}
