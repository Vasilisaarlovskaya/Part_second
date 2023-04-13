package AbstractFactory;

public class WhiteDog implements Dog{
    @Override
    public void voice() {
        System.out.println("White 'woof'");
    }
}
