/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_duvelleroy;

import static java.time.Clock.system;

/**
 *
 * @author valen
 */
public class TP2_Bieres_DUVELLEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * BouteilleBiere uneBiere = new BouteilleBiere(); uneBiere.nom = "Cuvée
         * des trolls"; uneBiere.degreAlcool = (float) 7.0; uneBiere.brasserie =
         * "Dubuisson"; uneBiere.ouverte = false;
         */
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");

        uneBiere.lireEtiquette();

        /**
         * BouteilleBiere autreBiere = new BouteilleBiere(); autreBiere.nom =
         * "Leffe"; autreBiere.degreAlcool = (float) 6.6; autreBiere.brasserie =
         * "Abbaye de Leffe"; autreBiere.ouverte = false;
         */
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        autreBiere.lireEtiquette();

        BouteilleBiere cineyBiere = new BouteilleBiere("Ciney", (float) 7.6, "Ciney");
        cineyBiere.lireEtiquette();

        BouteilleBiere duvelBiere = new BouteilleBiere("Duvel", (float) 8.6, "Duvel");
        duvelBiere.lireEtiquette();

        BouteilleBiere heinekenBiere = new BouteilleBiere("Heineken", (float) 9.6, "Heineken");
        heinekenBiere.lireEtiquette();

        System.out.println(uneBiere.ouverte);
        boolean Decapsuler = uneBiere.Decapsuler();
        System.out.println(uneBiere.ouverte);
        System.out.println(uneBiere);

        System.out.println(autreBiere);
        System.out.println(duvelBiere);
        System.out.println(heinekenBiere);

    }

}
