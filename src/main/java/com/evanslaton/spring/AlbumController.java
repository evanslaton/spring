package com.evanslaton.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepo;

    @Autowired
    private SongRepository songRepo;

    // Displays the database data to the user
    @RequestMapping(value="/albums", method= RequestMethod.GET)
    public String showAlbums(Model albumModel) {
        albumModel.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }

    // Accepts user input, adds it to the database, and redirects the user to /albums
    @RequestMapping(value="/albums", method= RequestMethod.POST)
    public RedirectView createAlbum(@RequestParam String title,
                                    @RequestParam String artist,
                                    @RequestParam int songCount,
                                    @RequestParam int length,
                                    @RequestParam String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }

    // Adds a song to an album
    @RequestMapping(value="/albums/{albumId}/songs", method= RequestMethod.POST)
    public RedirectView addSong(@PathVariable long albumId,
                                @RequestParam String title,
                                @RequestParam int length,
                                @RequestParam int trackNumber,
                                Model songModel){
        Song newSong = new Song(title, length, trackNumber);
        newSong.album = albumRepo.findById(albumId).get();
        songRepo.save(newSong);
        return new RedirectView("/albums");
    }

    // Redirects the user to a page where they view only one album and its songs
    @RequestMapping(value="/albums/{albumId}/show", method= RequestMethod.GET)
    public String addSong(@PathVariable long albumId,
                                Model albumModel){
        albumModel.addAttribute("album", albumRepo.findById(albumId).get());
        return "show-album";
    }
}
