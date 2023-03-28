package AbstractFactory;

public class Application {
    private Cat cat;
    private Dog dog;

    public Application(GUIFactory factory) {
        cat = factory.createCat();
        dog = factory.createDog();
    }
    public void voice() {
        cat.voice();
        dog.voice();
    }
}
