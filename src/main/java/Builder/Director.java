package Builder;

public class Director {
    public  void constructorCountryHouse (Builder builder) {
builder.setHouseType(HouseType.WOOD_HOUSE);
builder.setNumberOfRooms(6);
builder.setLighting(new Lighting());
builder.setWatersupply(new WaterSupply());
    }
    public void constructorCityHouse (Builder builder){
        builder.setHouseType(HouseType.PANEL_HOUSE);
        builder.setNumberOfRooms(2);
        builder.setLighting(new Lighting());
        builder.setWatersupply(new WaterSupply());
    }
}
