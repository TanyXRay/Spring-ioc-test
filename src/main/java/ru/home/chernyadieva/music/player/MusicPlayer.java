package ru.home.chernyadieva.music.player;

import ru.home.chernyadieva.music.interface_music.Music;

public class MusicPlayer {
    private Music music;

    /**
     * Внедрение зависимости с помощью setter-a
     * @param music
     */
    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic(){
       return "Playing: " + music.getSong();
    }
}
