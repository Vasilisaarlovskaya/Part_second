package AbstractFactory;

public class BlackDog implements Dog{
    @Override
    public void voice() {
        System.out.println("Black 'woof'");
    }
}
