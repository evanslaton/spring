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

    // Generic Constructor
    public Song() {}

    // Constructor
    public Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String toString() {
        return this.title + " is the #" + this.trackNumber + " and is " + this.length + " seconds long.";
    }
}
