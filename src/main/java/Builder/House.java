package Builder;

public class House {
    private final HouseType type;
    private final int rooms;
    private final Lighting lighting;
    private final WaterSupply watersupply;

    public House(HouseType type, int rooms, Lighting lighting, WaterSupply watersupply) {
        this.type = type;
        this.rooms = rooms;
        this.lighting = lighting;
        this.watersupply = watersupply;
    }

    public HouseType getType() {
        return type;
    }

    public int getRooms() {
        return rooms;
    }

    public Lighting getLighting() {
        return lighting;
    }

    public WaterSupply getWatersupply() {
        return watersupply;
    }
}
