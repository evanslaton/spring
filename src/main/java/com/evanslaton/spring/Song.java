package com.evanslaton.spring;

import javax.persistence.*;

@Entity
public class Song {
    // Instance properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;

    @ManyToOne
    public Album album;

    // Generic Constructor
    public Song() {}

    // Constructor
    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String toString() {
        return this.title + " is the #" + this.trackNumber + " song on the album and is " + this.length + " seconds long.";
    }
}
