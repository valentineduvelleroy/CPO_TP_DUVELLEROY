/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valen
 */
public class Convertisseur { //Création de la classe Convertisseur
        int nbConversions = 0; //Initialisation à 0
    int nb = nbConversions;
   
public double CelsiusVersKelvin ( double TC ){ //Double pour float
    double TK = TC + 273.14; 
    nbConversions +=1; //On ajoute +1 a nbConversions à chaque conversion qu'on fait
        return TK;
}

public double KelvinVersCelsius ( double TK ){
    double TC = TK - 273.14;
    nbConversions +=1;
        return TC;
}

public double FarenheitVersCelsius ( double TF ){
    double TC = (TF - 32) / 1.8;
    nbConversions+=1;
        return TC;
}

public double CelsiusVersFarenheit ( double TC ){
    double TF = (TC * 1.8) - 32;
    nbConversions +=1;
        return TF;
}

public double FarenheitVersKelvin ( double TF ){
    double TK = TF * (TF - 32) / 1.8 + 273.14;
    nbConversions +=1;
        return TK;
}

public double KelvinVersFarenheit ( double TK ){
    double TF = (TK - 273.14) * 1.8 + 32;
    nbConversions +=1;
        return TF;
}
@Override
public String toString () {
 return "nb de conversions"+ nbConversions; //nbConversions sera égal aux nombres de conversions totales
}

}

