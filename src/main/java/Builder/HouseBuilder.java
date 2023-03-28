package Builder;

public class HouseBuilder implements Builder {
    private HouseType type;
    private int rooms;
    private Lighting lighting;
    private WaterSupply watersupply;


    public void setHouseType(HouseType type) {
        this.type = type;
    }

    @Override
    public void setNumberOfRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setWatersupply(WaterSupply watersupply) {
        this.watersupply = watersupply;
    }

    @Override
    public void setLighting(Lighting lighting) {
        this.lighting = lighting;
    }

    public House getResult() {
        return new House(type, rooms, lighting, watersupply);
    }
}
