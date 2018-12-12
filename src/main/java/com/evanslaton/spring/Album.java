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
    public int songCount;
    public int length;
    public String imageUrl;

    // Default constructor
    Album(){}

    // Constructor
    Album(String title, int songCount, int length, String imageUrl) {
        this.title = title;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    // Returns the data from the instance as a String
    @Override
    public String toString() {
        return this.title + " has " + songCount +" song(s) and is " + length + " seconds long (" + imageUrl + ").";
    }
}
