package oop;

import oop.monsters.Monster;
import oop.monsters.Zombie;
import oop.monsters.Skeleton;

public class Inheritance {
    public static void main(String[] args) {
        Monster monster = new Monster(); 
        Skeleton skeleton = new Skeleton();
        Zombie zombie = new Zombie();


        zombie.attack();
    }
}