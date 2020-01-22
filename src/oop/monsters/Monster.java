package oop.monsters;

public abstract class Monster {
    private double walkingSpeed = 10;
    private double health;


    abstract protected void description();

    // methods should be protected
    public void attack() {


        System.out.println("Attacking method, class Monster");
    }

    public Monster() {
        System.out.println("Default constructor from class Monster");
    }

    public Monster(double walkingSpeed, double health) {
        System.out.println("Not default constructor from class Monster");
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