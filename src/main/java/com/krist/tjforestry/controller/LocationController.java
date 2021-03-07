package com.krist.tjforestry.controller;


import com.krist.tjforestry.data.LocationRepository;
import com.krist.tjforestry.data.PostRepository;
import com.krist.tjforestry.model.Location;
import com.krist.tjforestry.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/locations")
    public String listLocations(ModelMap modelMap) {
        List<Location> list = locationRepository.getALL_LOCATIONS();
        modelMap.put("locations", list);
        return "locations";
    }

    @RequestMapping("/location/{locationId}")
    public String getLocation(@PathVariable int locationId, ModelMap modelMap) {
        Location location = locationRepository.findByLocationId(locationId);
        modelMap.put("location", location);

        List<Post> posts = postRepository.getPostsByLocationId(locationId);
        modelMap.put("posts", posts);
        return "location";
    }
}
