package AbstractFactory;

public class BlackFactory implements GUIFactory{
    @Override
    public Cat createCat() {
        return new BlackCat();
    }
    @Override
    public Dog createDog() {
        return new BlackDog();
    }
}
