package tp3;

import tp3.Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author valen
 */
public class Baton extends Arme {

    int age;

    public Baton(String n, int i, int age) {
        super(n, i);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }

}
