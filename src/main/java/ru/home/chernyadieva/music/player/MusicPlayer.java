package ru.home.chernyadieva.music.player;

import ru.home.chernyadieva.music.interface_music.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        musicList.forEach(music -> System.out.println(music.getSong()));
    }
}
