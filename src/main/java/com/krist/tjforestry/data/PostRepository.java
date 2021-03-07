package com.krist.tjforestry.data;

import com.krist.tjforestry.model.Post;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
public class PostRepository {
    private static final List<Post> ALL_POSTS = Arrays.asList(
            new Post(1, "Jaunaudze Jelgavas novadā Svētes pagastā", 5.3, 2, LocalDate.of(2020, 11, 12), "SIA Īpašumi", false, "LatIpasumi@gmail.com"),
            new Post(2, "Daļēji izstrādāts mežs Nautrēnu pagastā", 2.4, 3, LocalDate.of(2021, 1, 12), "EG Forest", false, "EG_Forestry@gmail.com"),
            new Post(3, "Cirsma Platones pagasts", 0.1, 2, LocalDate.of(2021, 1, 12), "SIA Īpašumi", false, "LatIpasumi@gmail.com"),
            new Post(4, "Neizstrādāts mežs Vecsaules pagastā", 13.6, 1, LocalDate.of(2020, 11, 12), "EG Forest", true, "EG_Forestry@gmail.com"),
            new Post(5, "Jaunaudze Codes pagastā", 0.8, 1, LocalDate.of(2021, 2, 12), "SIA Īpašumi", false, "LatIpasumi@gmail.com"),
            new Post(6, "Daļēji izstrādāts mežs Līvbērzes pagastā", 4.2, 2, LocalDate.of(2021, 2, 12), "Normunds G.", false, "GilNormund@inbox.lv"),
            new Post(7, "Mežs atrodas skaistā vietā Dāviņu pagastā", 11, 1, LocalDate.of(2021, 2, 12), "Ivars S.", true, "Ivciks42@inbox.lv"),
            new Post(8, "Trīs hektāru mežs Sesavas pagastā", 2.2, 2, LocalDate.of(2020, 11, 15), "Reinis S.", true, "Reno.Silovs@inbox.lv"),
            new Post(9, "Jaunaudze", 1.9, 3, LocalDate.of(2021, 1, 12), "EG Forest", false, "EG_Forestry@gmail.com"),
            new Post(10, "Cirsma Zeļenieku pagastā", 0.1, 2, LocalDate.of(2021, 02, 1), "EG Forest", true, "EG_Forestry@gmail.com"),
            new Post(11, "Neizstrādāts mežs Valteķos", 3, 1, LocalDate.of(2021, 02, 3), "EG Forest", false, "EG_Forestry@gmail.com"),
            new Post(12, "Mežs Vircavas pagastā", 2.1, 2, LocalDate.of(2021, 01, 7), "Reinis S.", true, "Reno.Silovs@inbox.lv"),
            new Post(13, "Daļēji izstrādāts mežs Stružānu pagastā", 1, 3, LocalDate.of(2021, 2, 15), "Ivars S.", false, "Ivciks42@inbox.lv"),
            new Post(14, "Cirsma Brunevu pagastā", 1, 1, LocalDate.of(2020, 2, 17), "SIA Īpašumi", false, "LatIpasumi@gmail.com"),
            new Post(15, "Bērzu mežs Bauskas novadā, Gailīšu pagastā", 1, 0, LocalDate.of(2020, 2, 19), "SIA Īpašumi", false, "LatIpasumi@gmail.com")
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

    public List<Post> getPostsByLocationId(int locationId) {
        List<Post> locations = new ArrayList<>();
        for(Post post : ALL_POSTS) {
            if(post.getLocationId() == locationId) {
                locations.add(post);
            }
        }
        return locations;
    }

    public List<Post> getFavoritedPosts() {
        List<Post> favoritedPosts = new ArrayList<>();
        for(Post post : ALL_POSTS) {
            if(post.isFavorite() == true) {
                favoritedPosts.add(post);
            }
        }
        return favoritedPosts;
    }

    public List<Post> getPostByName(String name) {
        List<Post> list = new ArrayList<>();
        for(Post post : ALL_POSTS) {
            if(post.getDescription().toLowerCase().contains((name).toLowerCase())){
                list.add(post);
            };
        }
        return list;
    }
}
