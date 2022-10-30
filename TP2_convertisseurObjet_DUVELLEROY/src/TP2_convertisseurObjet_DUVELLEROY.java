/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author valen
 */
public class TP2_convertisseurObjet_DUVELLEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    int nb; 
    Scanner sc = new Scanner(System.in); 
    System.out.println("\nEntrer un nombre :");
    nb = sc.nextInt(); //Fonctionne comme un input d'un entier
    
    Convertisseur Numero1 = new Convertisseur(); //Déclare deux convertisseurs Numero1 et 2
    Convertisseur Numero2 = new Convertisseur();
    
    //Test du nombre de nbConversions
    Numero1.CelsiusVersKelvin(10.0); 
    Numero1.KelvinVersFarenheit(13.0);
    Numero2.FarenheitVersCelsius(25.0);
    System.out.println("Le nombre de conversions de Numero1 est " + Numero1.nbConversions + " et de Numero2 est " + Numero2.nbConversions + "");
    
    //Affichage du menu des différentes conversions
    System.out.println("\nQuelle conversion souhaitez-vous faire ?:");
    System.out.println("1)CelsiusVersKelvin");
    System.out.println("2)KelvinVersCelsius");
    System.out.println("3)FarenheitVersCelsius");
    System.out.println("4)CelsiusVersFarenheit");
    System.out.println("5)FarenheitVersKelvin");
    System.out.println("6)KelvinVersFarenheit");
    nb = sc.nextInt(); //Input de la conversion à accomplir
   
while (nb < 1 || nb > 6){ //Réponse différente que entre 1 et 6, alors erreur
    System.out.println("Erreur: Saisir une commande entre 1 et 6");
        System.out.println("\nQuelle conversion souhaitez-vous faire ?:");
        nb = sc.nextInt(); //Redemande jusqu'a ce que l'utilisateur donne une réponse entre 1 et 6
            
            }
System.out.println("Quelle temperature a convertir ?");
double T = sc.nextDouble(); //Input d'un float
switch(nb){ //Création du menu en fonction de la réponse choisie au dessus
   
       case 1: 
           System.out.println("Température en Kelvin: " + Numero1.CelsiusVersKelvin(T));
           break;
   
       case 2:
           System.out.println("Temperature en Celsius: " + Numero1.KelvinVersCelsius(T));
           break;
   
       case 3:
           System.out.println("Temperature en Celsius: " + Numero1.FarenheitVersCelsius(T));
           break;
       
       case 4: 
           System.out.println("Température en Farenheit: " + Numero1.CelsiusVersFarenheit(T));
           break;
   
       case 5:
           System.out.println("Temperature en Kelvin: " + Numero1.FarenheitVersKelvin(T));
           break;
   
       case 6:
           System.out.println("Temperature en Farenheit: " + Numero1.KelvinVersFarenheit(T));
           break;
        
   }
      
        
    }
}
    