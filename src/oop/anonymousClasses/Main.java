package oop.anonymousClasses;

public class Main {
    public static void main(String[] args) {
        // FIRST OPTION
        // ActionAfterPress button = new Button() {
        // button.action();

        // SECOND OPTION
        // ActionAfterPress button = new ActionAfterPress() {

        //     @Override
        //     public void action() {
        //         System.out.println("Anonymous class!");
        //     }
        // };
        // button.action();

        Button b = new Button();
        b.addAction(new ActionAfterPress(){
        
            @Override
            public void action() {
                System.out.println("Anonymous class!");
            } 
        });
    }
}

interface ActionAfterPress {
    void action();
}

// class Button implements ActionAfterPress {
class Button {
    void addAction(ActionAfterPress button) {
        button.action();
    }
}

// another option
class Button2 implements ActionAfterPress {

    @Override
    public void action() {
        System.out.println("Button2 pressed");
    }
}