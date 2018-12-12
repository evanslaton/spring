package com.evanslaton.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    //
    @RequestMapping(value="/albums", method= RequestMethod.GET)
    public String showAlbums(Model albumModel) {
//        Album[] albums = new Album[]{
//                new Album("Black Parade", 12, 1000000, "https://upload.wikimedia.org/wikipedia/en/thumb/e/ea/Blackparadecover.jpg/220px-Blackparadecover.jpg"),
//                new Album("Other Album", 3, 10000000, "https://upload.wikimedia.org/wikipedia/en/thumb/e/ea/Blackparadecover.jpg/220px-Blackparadecover.jpg")
//        };
        albumModel.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }
}
