/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;

/**
 *
 * @author valen
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Arme m = new Arme("arme standard", 4);

        m.setAttaque(30);
        m.setAttaque(-230);

        System.out.println("attaque de l'arme: " + m.getAttaque());
    }

    Epee e = new Epee("Excalibur", 7, 5);
    Epee d = new Epee("Durandal", 4, 7);

    Baton baton1 = new Baton("Chene", 4, 5);
    Baton baton2 = new Baton("Charme", 5, 6);

}
