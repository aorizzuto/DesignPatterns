package Creational.Prototype;

import javafx.geometry.Point3D;

public class Client {
    
    public static void main(String[] args) {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0),20);
        s1.atack();

        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println(s2);
    }
}