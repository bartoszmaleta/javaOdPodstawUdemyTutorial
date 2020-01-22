package oop;

import oop.monsters.Monster;
import oop.monsters.Zombie;
import oop.monsters.Skeleton;

public class Inheritance {
    public static void main(String[] args) {
        // Monster monster = new Monster(10, 100);
        // System.out.println(monster.getWalkingSpeed());

        // Skeleton skeleton = new Skeleton(20, 50, "Longbow");
        // System.out.println(skeleton.getHealth());

        // Zombie zombie = new Zombie();

        // skeleton.attack();

        // Monster monster = new Monster(); // cannot because it is abstract
        
        Monster monster2 = new Skeleton(32, 200);

        monster2.attack();

        Monster monster3 = new Zombie();
        monster3.attack();
    }
}