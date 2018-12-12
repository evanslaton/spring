package com.evanslaton.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public int songCount;
    public int length;
    public String imageUrl;

    Album(String title, int songCount, int length, String imageUrl) {
        this.title = title;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return this.title + " has " + songCount +"(s) and is " + length + " seconds long (" + imageUrl + ").";
    }
}
