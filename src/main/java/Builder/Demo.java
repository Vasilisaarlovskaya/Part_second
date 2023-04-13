package Builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.constructorCityHouse(builder);
        House house = builder.getResult();
        System.out.println("House built: " + house.getType());
    }
}
