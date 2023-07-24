package org.part3.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String song, double durationOfSong) {
        return songs.add(new Song(song, durationOfSong));
    }

    private Song findSong(String titleOfSong) {
        return songs.stream()
                .filter(title -> titleOfSong.equals(title.getTitle()))
                .findFirst()
                .orElse(null);

    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist) {
        return true;
    }

}
