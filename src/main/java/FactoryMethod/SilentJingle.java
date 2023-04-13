package FactoryMethod;

public class SilentJingle implements Jingle{

    public void move () {
        System.out.println("Silend Jingle: 't-sh'");
        stop();
    }

    public void stop() {
        System.out.println("Stop Silend Jingle");
    }
}
