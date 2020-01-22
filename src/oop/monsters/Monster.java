package oop.monsters;

public class Monster {
    private double walkingSpeed = 10;
    private double health;

    public void attack() {


        System.out.println("Attacking method, class Monster");
    }

    public Monster() {

    }

    public Monster(double walkingSpeed, double health) {
        this.walkingSpeed = walkingSpeed;
        this.health = health;
    }
    
    

    public double getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(double walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}