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
 
        Tartiflette assiette3 = assiette2; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;

       //Moussaka assiette666 = assiette1 ;
       //Moussaka assiette667 = new Tartiflette() ;
      
       Moussaka tab [] = new Moussaka [10];
        for (int i = 0; i < 9; i++){
            Moussaka T = new Moussaka();
            tab[i]=T;
            System.out.println(tab[i]);
        }
    }
}