package org.part3.playlist;

public class NoSuchSongException extends RuntimeException{
    private static final String MESSAGE = "No such song in this album";

    public NoSuchSongException() {
        super(MESSAGE);
    }
}