package com.krist.tjforestry.data;

import com.krist.tjforestry.model.Location;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class LocationRepository {

    private static final List<Location> ALL_LOCATIONS = Arrays.asList(
            new Location(1,"Bauskas novads"),
            new Location(2, "Jelgavas novads"),
            new Location(3, "Rēzeknes novads")
    );

    public List<Location> getALL_LOCATIONS() {
        return ALL_LOCATIONS;
    }

    public Location findByLocationId(int Id) {
        for(Location loc : ALL_LOCATIONS) {
            if(loc.getId() == Id) {
                return loc;
            }
        }
        return null;
    }

    public String getAreaName(int id) {
        Location theOne = ALL_LOCATIONS.get(id);
        return theOne.getLocation();
    }
}
