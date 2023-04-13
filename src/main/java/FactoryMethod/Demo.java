package FactoryMethod;

public class Demo {
    private static Choice choice;

    public static void main(String[] args) {
        configure();
        logic();
    }
    static void configure(){
        if ("Loud".equals("Loud")) {
            choice = new LoudJingleChoice();
        } else {
            choice = new SilentJingleChoice();
    }
    }

    static void logic() {
        choice.moveJingle();
    }
}

