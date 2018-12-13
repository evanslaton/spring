package com.evanslaton.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    // Instance properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;
    public Album album;

    // Generic Constructor
    Song() {}

    // Constructior
    Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String toString() {
        return this.title + " is the #" + this.trackNumber + " track on " + this.album.title + " and is " + this.length + " seconds long.";
    }
}
