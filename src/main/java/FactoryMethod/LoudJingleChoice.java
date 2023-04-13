package FactoryMethod;

public class LoudJingleChoice extends Choice{
    @Override
    public Jingle createJingle() {
        return new LoudJingle();
    }
}
