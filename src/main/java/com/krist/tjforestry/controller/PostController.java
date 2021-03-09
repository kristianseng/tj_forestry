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
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private LocationRepository locationRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Post> posts = postRepository.getAllPosts();
        modelMap.put("posts", posts);
        return "home";
    }

    @RequestMapping("/post/{id}")
    public String PostDetails(@PathVariable int id, ModelMap modelMap) {
        Post post = postRepository.findById(id);
        int loci = post.getLocationId();
        modelMap.put("post", post);
        String location = locationRepository.getAreaName(loci);
        modelMap.put("locationName", location);
        return "post-details";
    }

    @RequestMapping("/favorites")
    public String FavoritePage(ModelMap modelMap) {
        List<Post> list = postRepository.getFavoritedPosts();
        modelMap.put("favorites", list);
        return "favorites";
    }

    @RequestMapping(value = {"/", "/favorites", "/locations"}, params="q")
    public String Search(@RequestParam String q, ModelMap modelMap) {
        List<Post> list = postRepository.getPostByName(q);
        modelMap.put("posts", list);
        return "home";
    }
}
