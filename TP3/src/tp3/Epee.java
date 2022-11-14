package tp3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valen
 */

public class Epee extends Arme{
    private int indice;
    

    public Epee(String n, int i, int ind){
        super(n, i);
        this.indice = indice;

    }   

    @Override
    public String toString() {
        return "Epee{" + "indice=" + indice + '}';
    }
    
}
