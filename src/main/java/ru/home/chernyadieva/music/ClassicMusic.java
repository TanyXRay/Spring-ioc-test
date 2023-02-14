package ru.home.chernyadieva.music;

import ru.home.chernyadieva.music.interface_music.Music;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Claire the moon";
    }
}
