package AbstractFactory;

public class WhiteFactory implements GUIFactory{
    @Override
    public Cat createCat() {
        return new WhiteCat();
    }

    @Override
    public Dog createDog() {
        return new WhiteDog();
    }
}
