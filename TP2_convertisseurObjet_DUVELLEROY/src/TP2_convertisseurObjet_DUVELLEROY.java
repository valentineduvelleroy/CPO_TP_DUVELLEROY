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
    System.out.println("\n Entrer un nombre :");
    nb = sc.nextInt();
    Convertisseur Numero1 = new Convertisseur();
    Convertisseur Numero2 = new Convertisseur();
    
    Numero1.CelsiusVersKelvin(10.0);
    Numero1.KelvinVersFarenheit(13.0);
    Numero2.FarenheitVersCelsius(25.0);
  
    
    System.out.println( "Le nombre de conversions de Numero1 est " + Numero1.nbConversions + " et de Numero2 est " + Numero2.nbConversions + "");
        
        
        
        
    }
}
    