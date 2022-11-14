package tp3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valen
 */
public class Arme {

    String nom;
    private int attaque;

    public Arme(String n, int i) {
        nom = n;
        if (attaque > 0) {
            attaque = i;
        } else {
            if (attaque > 100);
            attaque = 100;

        }
    }
    

    public int getAttaque(){
        return attaque;

    }

    public void setAttaque(int attaque){
        this.attaque = attaque;
    }

    int recupattaque(){
    return attaque;
}
}