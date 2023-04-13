package FactoryMethod;

public class SilentJingleChoice extends Choice{
    @Override
    public Jingle createJingle() {
        return new SilentJingle();
    }
}
