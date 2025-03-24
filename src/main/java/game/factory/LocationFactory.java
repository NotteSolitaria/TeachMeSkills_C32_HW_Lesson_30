package game.factory;

import game.location.Location;
import game.location.locationImpl.City;
import game.location.locationImpl.Desert;
import game.location.locationImpl.Forest;

public class LocationFactory {
    public static Location createLocation(String locationChoice) {
        return switch (locationChoice.toLowerCase()) {
            case "city" -> new City();
            case "desert" -> new Desert();
            case "forest" -> new Forest();
            default -> throw new IllegalArgumentException("Invalid location choice: " + locationChoice);
        };
    }
}
