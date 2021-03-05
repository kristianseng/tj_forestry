package com.krist.tjforestry.controller;

import com.krist.tjforestry.data.PostRepository;
import com.krist.tjforestry.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Post> posts = postRepository.getAllPosts();
        modelMap.put("posts", posts);
        return "home";
    }

    @RequestMapping("/post/{id}")
    public  String PostDetails(@PathVariable int id, ModelMap modelMap) {
        Post post = postRepository.findById(id);
        modelMap.put("post", post);
        return "post-details";
    }
}
