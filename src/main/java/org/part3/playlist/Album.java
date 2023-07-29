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
        songs = new ArrayList<>();
    }

    public boolean addSong(String song, double durationOfSong) {
        return songs.add(new Song(song, durationOfSong));
    }

    private Song findSong(String titleOfSong) {
        return songs.stream()
                .filter(song -> titleOfSong.equals(song.getTitle()))
                .findAny()
                .orElseThrow(NoSuchSongException::new);

    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {
        if (songs.size() <= numberOfSong)
            return false;
        return playlist.add(songs.get(numberOfSong));
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist) {
        Song song;
        try {
            song = findSong(titleOfSong);
        }
        catch (NoSuchSongException e){
            System.out.println(e.getMessage());
            return false;
        }
        return playlist.add(song);
    }

}
