package AbstractFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String speciesName = ("black");
        if (speciesName.contains("black")) {
            factory = new BlackFactory();
        } else {
            factory = new WhiteFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.voice();
    }
}
