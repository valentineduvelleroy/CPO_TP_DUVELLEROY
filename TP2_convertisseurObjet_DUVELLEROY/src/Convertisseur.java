/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valen
 */
public class Convertisseur {
        int nbConversions = 0;
    int nb = nbConversions;
   
public double CelsiusVersKelvin ( double TC ){
    double TK = TC + 273.14;
        return TK;
}

public double KelvinVersCelsius ( double TK ){
    double TC = TK - 273.14;
        return TC;
}

public double FarenheitVersCelsius ( double TF ){
    double TC = (TF - 32) / 1.8;
        return TC;
}

public double CelsiusVersFarenheit ( double TC ){
    double TF = (TC * 1.8) - 32 ;
        return TF;
}

public double FarenheitVersKelvin ( double TF ){
    double TK = ;
        return TK;
}

public double KelvinVersFarenheit ( double TK ){
    double TF = ;
        return TF;
}
}


