package ru.home.chernyadieva.music;

import ru.home.chernyadieva.music.interface_music.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz: Hit the road Jack";
    }
}
