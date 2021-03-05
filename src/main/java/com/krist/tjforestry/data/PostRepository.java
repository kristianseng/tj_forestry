package com.krist.tjforestry.data;

import com.krist.tjforestry.model.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class PostRepository {
    private static final List<Post> ALL_POSTS = Arrays.asList(
            new Post(1, "Jaunaudze Jelgavas novadā Svētes pagastā", 5, "Jelgavas novads", LocalDate.of(2020, 11, 12), "SIA Īpašumi", false),
            new Post(2, "Daļēji izstrādāts mežs Nautrēnu pagastā", 2, "Rēzeknes novads", LocalDate.of(2021, 1, 12), "EG Forest", false),
            new Post(3, "Cirsma Platones pagasts", 8, "Jelgavas novads", LocalDate.of(2021, 1, 12), "SIA Īpašumi", false),
            new Post(4, "Neizstrādāts mežs Vecsaules pagastā", 22, "Bauskas novads", LocalDate.of(2020, 11, 12), "EG Forest", true),
            new Post(5, "Jaunaudze Codes pagastā", 15, "Bauskas novads", LocalDate.of(2021, 2, 12), "SIA Īpašumi", false),
            new Post(6, "Daļēji izstrādāts mežs Līvbērzes pagastā", 7, "Jelgavas novads", LocalDate.of(2021, 2, 12), "Normunds G.", true),
            new Post(7, "Mežs atrodas skaistā vietā Dāviņu pagastā", 18, "Bauskas novads", LocalDate.of(2021, 2, 12), "Ivars S.", false),
            new Post(8, "Trīs hektāru mežs Sesavas pagastā", 3, "Jelgavas novads", LocalDate.of(2020, 11, 15), "Reinis S.", false),
            new Post(9, "Jaunaudze Valgundas pagastā", 5, "Jelgavas novads", LocalDate.of(2021, 1, 12), "EG Forest", false)
    );

    public Post findById(int id) {
        for(Post post : ALL_POSTS) {
            if(post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List<Post> getAllPosts() {
        return ALL_POSTS;
    }
}
