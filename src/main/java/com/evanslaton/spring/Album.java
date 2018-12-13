package com.evanslaton.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    // Instance properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    // Default constructor
    public Album(){}

    // Constructor
    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // Returns the data from the instance as a String
    @Override
    public String toString() {
        return this.title + " by " + this.artist + " has " + songCount +" song(s) and is " + length + " seconds long (" + imageUrl + ").";
    }
}
