package ru.home.chernyadieva.music.player;

import ru.home.chernyadieva.music.interface_music.Music;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String playMusic(){
       return "Playing: " + music.getSong();
    }
}
