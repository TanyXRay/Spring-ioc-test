package ru.home.chernyadieva.music.player;

import ru.home.chernyadieva.music.interface_music.Music;

public class MusicPlayer {
    private Music music;
    private String author;
    private int rating;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return "Playing: " + music.getSong() +
                "\nAuthor: " + getAuthor() +
                "\nRating: " + getRating();
    }
}
