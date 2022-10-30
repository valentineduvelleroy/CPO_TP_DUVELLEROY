/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_duvelleroy;

/**
 *
 * @author valen
 */
public class TP2_relation_1_DUVELLEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //Création des voitures + personnes
      Voiture uneClio = new Voiture ("Clio", "Renault", 5, null) ;
      Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5, null) ;
      Voiture uneBMW = new Voiture ("325", "BMW", 9, null) ;
      Voiture une2008 = new Voiture ("2008", "Peugeot", 6, null) ;
      Voiture uneMicra = new Voiture ("Micra", "Nissan", 4, null) ;
      Personne bob = new Personne("Bobby", "Sixkiller");
      Personne reno = new Personne("Reno", "Raines");
      System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);  
    
      //Test maximum nombre de voitures 
      bob.nbVoitures = 3 ;
      bob.liste_voitures[0] = uneClio ; 
      bob.liste_voitures[1] = uneAutreClio ; 
      bob.liste_voitures[2] = uneBMW ; 
      uneClio.proprietaire = bob;
      uneAutreClio.proprietaire = bob;
      uneBMW.proprietaire = bob;
      System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] + " et la deuxieme est " + bob.liste_voitures[1] + " et la troisieme est " + bob.liste_voitures[2]) ;
      System.out.println(bob.ajouter_voiture(uneMicra));

     //Test voiture volée BMW de bob 
      System.out.println(reno.ajouter_voiture(une2008));
      System.out.println(reno.ajouter_voiture(uneBMW));  
    }
}
