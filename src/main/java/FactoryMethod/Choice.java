package FactoryMethod;

public abstract class Choice {
    public void moveJingle() {
        Jingle jingle = createJingle();
        jingle.move();
    }
    public abstract Jingle createJingle();
}
