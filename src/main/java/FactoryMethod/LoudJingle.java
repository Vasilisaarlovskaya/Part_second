package FactoryMethod;

public class LoudJingle implements Jingle{
    public void move() {
        System.out.println("Loud Jingle 'd-zin'");
        stop();
    }

    public void stop() {

        System.out.println("Stop Loud Jingle");
    }
}
