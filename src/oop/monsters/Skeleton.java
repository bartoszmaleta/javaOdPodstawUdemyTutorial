package oop.monsters;

public class Skeleton extends Monster {

    @Override
    public void attack() {
        super.attack();
        System.out.println("Attacking method, class Skeleton");
    }

    private String weapon;

    public Skeleton() {
        System.out.println("Default constructor from class Skeleton");
    }

    public Skeleton(double walkingSpeed, double health){
        super(walkingSpeed, health);
        System.out.println("Not default constructor from class Skeleton");
    }

    public Skeleton(double walkingSpeed, double health, String weapon) {
        super(walkingSpeed, health);
        this.weapon = weapon;
        System.out.println("Not default constructor from class Skeleton");
    }

    @Override
    protected void description() {

    }


}