package ru.home.chernyadieva.music.player;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import ru.home.chernyadieva.music.interface_music.Music;

public class MusicPlayer {
    private Music music;

    public void setMusic(Music music) {
        this.music = music;
    }

    private MusicPlayer() {
    }

    private void initBeforeBeanCreation() {
        System.out.println("method of initialization before bean creation");
    }

    private void destroyBeforeClosingApp() {
        System.out.println("method of destroy before closing the application");
    }

    @Contract(value = " -> new", pure = true)
    public static @NotNull MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    public String playMusic() {
        return "Playing: " + music.getSong();
    }
}
