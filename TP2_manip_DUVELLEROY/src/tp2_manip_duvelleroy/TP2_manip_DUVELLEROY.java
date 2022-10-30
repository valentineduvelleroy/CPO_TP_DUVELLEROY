/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_duvelleroy;

/**
 *
 * @author valen
 */
public class TP2_manip_DUVELLEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);
 
        Tartiflette assiette3 = assiette2; //Il y en a réellement 1 seule qui a été créée, 
        //car nbCalories de 3 = nbCalories de 2 = 600 qui correspond à une tartiflette 
        //Elles représentent la même tartiflette
       
        assiette2 = assiette1;
        assiette1 = assiette3; 
        //Echange les objets assiette 1 et assiette 2 grâce à une autre variable
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

       //Les deux lignes de codes ne fonctionnent pas
       //Moussaka assiette666 = assiette1 ;
       //Moussaka assiette667 = new Tartiflette() ;
      
       Moussaka tab [] = new Moussaka [10];
        for (int i = 0; i < 9; i++){ 
        //Strictement inférieur à 9 car le tableau commence à 0, donc il y a bien 10 valeurs
            Moussaka T = new Moussaka();
            tab[i]=T;
            System.out.println(tab[i]);
        }
    }
}
